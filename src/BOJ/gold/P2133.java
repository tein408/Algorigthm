package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2133 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        if(n % 2 == 1) {
            System.out.println(0);
            return;
        }

        int[] dp = new int[31];
        dp[0] = 1;
        dp[2] = 3;

        for(int i=4; i<=n; i++) {
            dp[i] = dp[i-2] * dp[2];
            for(int j=i-4; j>=0; j-=2) {
                dp[i] += dp[j] * 2;
            }
        }

        System.out.println(dp[n]);

    }
}
