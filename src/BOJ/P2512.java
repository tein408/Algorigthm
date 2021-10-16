package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2512 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int mon = Integer.parseInt(bf.readLine());

        Arrays.sort(arr);

        System.out.println(find(arr, mon));

    }

    static int find(int[] arr, int key) {
        int left = 0;
        int right = arr[arr.length-1];
        int mid;
        int ans = 0;

        while(left <= right) {
            mid = (left + right) / 2;
            int sum = 0;
            for(int i=0; i<arr.length; i++) {
                if(arr[i] >= mid)
                    sum += mid;
                else
                    sum += arr[i];
            }

            if(sum > key) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
                ans = ans > mid ? ans : mid;
            }
        }
        return ans;
    }
}
