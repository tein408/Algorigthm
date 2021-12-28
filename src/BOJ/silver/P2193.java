package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P2193 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        long[] arr = new long[n+1];

        arr[0] = 0;
        arr[1] = 1;

        for(int i=2; i<=n; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }

        System.out.println(arr[n]);

    }
}
