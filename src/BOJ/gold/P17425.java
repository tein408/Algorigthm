package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P17425 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(bf.readLine());

        long[] dp = new long[1000001];
        dp[1] = 1;

        for(int i=2; i<1000001; i++) {
            // i의 배수 칸에 i 더하기
            for(int j=1; i*j<1000001; j++) {
                dp[i*j] += i;
            }
            // 1은 모든 수의 약수
            dp[i] += dp[i-1] + 1;
        }

        while(t-- > 0) {
            int n = Integer.parseInt(bf.readLine());
            sb.append(dp[n]).append("\n");
        }

        System.out.println(sb);
    }

}
