package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9461 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(bf.readLine());

        long[] dp = new long[101];

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;

        for(int i=6; i<101; i++) {
            dp[i] = dp[i-1] + dp[i-5];
        }

        while(t-- > 0) {

            int n = Integer.parseInt(bf.readLine());
            sb.append(dp[n]).append("\n");

        }

        System.out.println(sb);

    }
}
