package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1912 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sum = new int[n];
        sum[0] = arr[0];
        int max = arr[0];

        for(int i=1; i<n; i++) {
            sum[i] = Math.max(sum[i-1] + arr[i], arr[i]);
            max = Math.max(sum[i], max);
        }

        System.out.println(max);

    }
}
