package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P3079 {

    static long max = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            max = Math.max(max, arr[i]);
        }

        System.out.println(find(arr, m));
    }

    static long find(int[] arr, long key) {
        long left = 0;
        long right = max * key;
        long mid = 0;
        long ans = 0;

        while(left <= right) {
            mid = left + (right - left) / 2;

            long sum = 0;
            for(int i=0; i<arr.length; i++) {
                sum += mid/arr[i];
            }

            if(sum >= key) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return ans;
    }

}
