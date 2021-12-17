package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P17626 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        System.out.println(fourSquares(n));
    }

    static int fourSquares(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2; i<n+1; i++) {
            int min = Integer.MAX_VALUE;
            for(int j=1; j*j <= i; j++) {
                min = Math.min(min, arr[i - j * j]);
            }
            arr[i] = min + 1;
        }
        return arr[n];
    }
}
