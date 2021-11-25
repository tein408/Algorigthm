package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11053 {

    static int n;
    static int[] arr, dp;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());

        if(n == 1) {
            System.out.println(1);
            return;
        }

        StringTokenizer st = new StringTokenizer(bf.readLine());

        arr = new int[n];
        dp = new int[n];
        dp[0] = 1;
        int max = 0;

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<n; i++) {
            dp[i] = 1;
            for(int j=0; j<i; j++) {
                if(arr[i] > arr[j] && dp[j] + 1 > dp[i])
                    dp[i] = dp[j] + 1;
            }
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

    }

}
