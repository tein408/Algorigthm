package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11054 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] left = new int[n];
        int[] right = new int[n];

        Arrays.fill(left, 1);
        Arrays.fill(right, 1);

        for(int i=0; i<n; i++) {
            for(int j=i; j>=0; j--) {
                if(arr[i] > arr[j]) {
                    left[i] = Math.max(left[i], left[j] + 1);
                }
            }
        }

        for(int i=n-1; i>=0; i--) {
            for(int j=i; j<n; j++) {
                if(arr[i] > arr[j]) {
                    right[i] = Math.max(right[i], right[j] + 1);
                }
            }
        }

        int ans = 0;
        for(int i=0; i<n; i++) {
            ans = Math.max(ans, left[i] + right[i]);
        }

        System.out.println(ans - 1);
    }
}
