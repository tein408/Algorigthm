package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1932 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());

        int[][] dp = new int[n+1][n+1];
        int max = -1;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            for(int j=0; j<=i; j++) {
                dp[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1; i<n; i++) {
            for(int j=0; j<=i; j++) {
                if (j == 0) {   // 맨 왼쪽이면  한쪽 대각선만 보면됨
                    dp[i][j] += dp[i-1][j];
                } else if (j == i) {    //맨 오른쪽도 마찬가지
                    dp[i][j] += dp[i-1][j-1];
                } else {    //둘다 아니라면 대각선 둘 중 최댓값을 더하기
                    dp[i][j] = Math.max(dp[i][j] + dp[i-1][j-1], dp[i][j] + dp[i-1][j]);
                }
            }
        }

        //맨 마지막 줄 처리
        for (int i=0;i<n;i++) {
            max = Math.max(max, dp[n-1][i]);
        }

        System.out.println(max);

    }

}
