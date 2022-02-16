package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2293 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coin = new int[n+1];
        for(int i=1; i<=n; i++) {
            coin[i] = Integer.parseInt(bf.readLine());
        }

        int[] dp = new int[k+1];
        dp[0] = 1;
        for(int i=1; i<=n; i++) {
            for(int j=coin[i]; j<=k; j++) {
                dp[j] = dp[j] + dp[j - coin[i]];
            }
        }

        System.out.println(dp[k]);
    }
}
