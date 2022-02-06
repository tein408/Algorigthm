package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1699 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n+1];

        for(int i=1; i<=n; i++) {
            arr[i] = i;
            for(int j=1; j*j<=i; j++)
                arr[i] = Math.min(arr[i], arr[i-j*j] + 1);
        }
        System.out.println(arr[n]);
    }
}
