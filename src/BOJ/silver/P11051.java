package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11051 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] dp = new int[1001][1001];

        for(int i=1; i<=n; i++) {
            for(int j=0; j<=n; j++) {
                if(i==j || j==0)
                    dp[i][j] = 1;
                else
                    dp[i][j] = (dp[i-1][j] + dp[i-1][j-1]) % 10007;
            }
        }

        System.out.println(dp[n][k]);

    }
}
