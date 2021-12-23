package leetcode.medium;

import java.util.Arrays;

public class LC973 {

    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        int[][] ans = new int[k][2];

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = distance(points[i]);
        }

        Arrays.sort(arr);
        int idx = 0;
        for(int i=0; i<n; i++) {
            if(distance(points[i]) <= arr[k-1]) {
                ans[idx++] = points[i];
            }
        }

        return ans;

    }

    int distance(int[] p) {
        return p[0] * p[0] + p[1] * p[1];
    }

}
