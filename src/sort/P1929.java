package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1929 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        isPrime(a,b);

    }

    static int num = 1000001;
    static int[] arr = new int[num];

    static void isPrime(int a, int b){
        for(int i=2; i<num; i++) arr[i] = i;
        for(int i=2; i<num; i++){
            if(arr[i] == 0) continue;
            for(int j=2*i; j<num; j+=i) arr[j] = 0;
        }
        for(int i=a; i<=b; i++) {
            if(arr[i]!=0) System.out.println(arr[i]);
        }

    }
}
