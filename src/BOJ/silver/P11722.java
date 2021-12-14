package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class P11722 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        dp[0] = 1;

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int max = 1;

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<n; i++) {
            dp[i] = 1;
            for(int j=0; j<i; j++) {
                if(arr[i] < arr[j] && dp[j] >= dp[i])
                    dp[i] = dp[j] + 1;
            }
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

    }
}
