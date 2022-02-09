package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9251 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s1 = bf.readLine();
        String s2 = bf.readLine();

        int n = s1.length();
        int m = s2.length();

        int[][] memo = new int[n+1][m+1];

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    memo[i][j] = memo[i-1][j-1] + 1;
                }else {
                    memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
                }
            }
        }

        System.out.println(memo[n][m]);
    }
}
