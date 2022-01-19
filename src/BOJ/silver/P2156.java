package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2156 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] wine = new int[n];

        for (int i=0; i<n; i++) {
            wine[i] = Integer.parseInt(bf.readLine());
        }

        int[] dp = new int[n];
        dp[0] = wine[0];
        for (int i=1; i<n; i++) {
            if(i==1) {
                dp[1] = wine[0] + wine[1];
            } else if(i==2) {
                dp[2] = Math.max(dp[1], Math.max(wine[0]+ wine[2], wine[1]+wine[2]));
            } else {
                dp[i] = Math.max(dp[i-1], Math.max(dp[i-2]+wine[i], dp[i-3]+wine[i-1]+wine[i]));
            }
        }

        System.out.println(dp[n-1]);
    }
}
