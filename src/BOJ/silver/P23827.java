package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P23827 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        long[] arr = new long[n+1];
        long[] sum = new long[n+1];

        long answer = 0;
        long mod = 1000000007;

        for(int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] = sum[i-1] + arr[i];
        }

        //a b c d
        //ab ac ad bc bd cd
        // = a(b c d) b(c d) c(d)
        //누적합 = 현재값 * (전체 합 - 현재까지의 합)
        for(int i=1; i<=n; i++) {
            answer += arr[i] * (sum[n] - sum[i]);
            answer %= mod;
        }

        System.out.println(answer);

    }
}
