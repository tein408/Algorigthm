package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P24039 {

    static int[] arr = new int[10001];
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        isPrime();

        int[] sp = new int[10001];
        sp[0] = list.get(0) * list.get(1);
        sp[1] = list.get(2) * list.get(1);

        int idx = 0;
        for(int i=0; i<10000; i++) {
            sp[i] = list.get(i+1) * list.get(i);
            if(sp[i] > n) {
                idx = i;
                break;
            }
        }
        System.out.println(sp[idx]);

    }

    static void isPrime(){

        for(int i=2; i<10001; i++)
            arr[i] = i;

        for(int i=2; i<10001; i++){
            if(arr[i] == 0)
                continue;
            for(int j=2*i; j<10001; j+=i)
                arr[j] = 0;
        }

        for(int i=2; i<10001; i++) {
            if(arr[i]!=0)
                list.add(arr[i]);
        }

    }
}
