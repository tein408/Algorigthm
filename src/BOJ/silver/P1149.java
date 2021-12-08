package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1149 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[][] cost = new int[n+1][4];
        int[][] dp = new int[n+1][4];

        StringTokenizer st;

        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            for(int j=0; j<3; j++) {
                cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1; i<=n; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + cost[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + cost[i][2];
        }

        System.out.println(Math.min(Math.min(dp[n][0], dp[n][1]), dp[n][2]));

    }

}
