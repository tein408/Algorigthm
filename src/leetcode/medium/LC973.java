package leetcode.medium;

import java.util.Arrays;

public class LC973 {

    //직관적인 풀이
/*    public int[][] kClosest(int[][] points, int k) {
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
*/

    int distance(int[] p) {
        return p[0] * p[0] + p[1] * p[1];
    }

    //quick selection
    public int[][] kClosest(int[][] points, int k) {
        return select(points, k);
    }

    int[][] select(int[][] points, int k) {
        int left = 0, right = points.length - 1;

        while(left < right) {
            int pivot = partition(points, left, right);

            if(pivot == k) {
                break;
            } else if(pivot < k) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }

        return Arrays.copyOf(points, k);
    }

    int partition(int[][] points, int left, int right) {
        int mid = left + (right - left) / 2;
        int dis = distance(points[mid]);

        swap(points, mid, right);
        for(int i=left; i<right; i++) {
            if(distance(points[i]) < dis) {
                swap(points, left, i);
                left++;
            }
        }
        swap(points, left, right);

        return left;
    }

    void swap(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
