package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P7453 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[][] arr = new int[n][4];
        int[] a = new int[n*n];
        int[] b = new int[n*n];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            for(int j=0; j<4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int idx = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                a[idx] = arr[i][0] + arr[j][1];
                b[idx] = arr[i][2] + arr[j][3];
                idx++;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);

        long ans = 0;

        for(int i=0; i<a.length; i++) {
            ans += upper(b, -a[i]) - lower(b, -a[i]);
        }

        System.out.println(ans);
    }

    static int upper(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] <= target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }

    static int lower(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }

}
