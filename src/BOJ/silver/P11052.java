package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11052 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] card = new int[n+1];
        int[] buy = new int[n+1];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i=1; i<=n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                buy[i] = Math.max(buy[i], card[j] + buy[i-j]);
            }
        }

        System.out.println(buy[n]);
    }
}
