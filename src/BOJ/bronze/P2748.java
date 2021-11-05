package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2748 {

    static long[] arr = new long[91];

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        System.out.println(fibo(n));
    }

    static long fibo(int n) {
        arr[1] = arr[2] = 1;
        for(int i=3; i<=n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
