package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2579 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] stair = new int[n+1];
        int[] dp = new int[n+1];

        for(int i=1; i<=n; i++) {
            stair[i] = Integer.parseInt(bf.readLine());
        }

        dp[0] = stair[0];
        dp[1] = stair[1];

        if(n > 1)
            dp[2] = stair[1] + stair[2];

        for(int i=3; i<=n; i++) {
            dp[i] = stair[i] + Math.max(dp[i-2], dp[i-3] + stair[i-1]);
        }

        System.out.println(dp[n]);

    }
}
