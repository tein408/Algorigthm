package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11055 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = arr[1];

        int res = dp[1];
        for(int i=2; i<=n; i++) {
            dp[i] = arr[i];
            for(int j=1; j<i; j++) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + arr[i]);
                }
            }
            res = Math.max(res, dp[i]);
        }

        System.out.println(res);
    }
}
