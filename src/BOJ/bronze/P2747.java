package BOJ.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        System.out.println(fibo(num));
    }

    static int fibo(int num){
        if(num < 2) return num;
        else {
            int[] arr = new int[num+1];
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 1;
            for(int i=2; i<num+1; i++){
                arr[i] = arr[i-1] + arr[i-2];
            }
            return arr[num];
        }
    }

}
