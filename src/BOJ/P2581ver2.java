package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2581ver2 {

    static int hap=0, min=0;
    static int[] arr = new int[10001];

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(bf.readLine());
        int num2 = Integer.parseInt(bf.readLine());

        arr[0] = 1;
        arr[1] = 1;
        for(int i=2; i<10001; i++){
            if(arr[i] == 0)
                for(int j=2*i; j<10001; j+=i)
                    arr[j] = 1;
        }

        for(int i = num1; i<=num2; i++){
            if(arr[i] == 0){
                hap += i;
                if(min == 0) min = i;
            }
        }

        if(hap!=0) System.out.println(hap+"\n"+min);
        else System.out.println(-1);


    }
}
