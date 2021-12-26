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
        int pivotIdx = points.length;
        while(pivotIdx != k) {
            // 배열 나누기
            pivotIdx = partition(points, left, right);
            // 1구역 정렬
            if(pivotIdx < k)
                left = pivotIdx;
            // 2구역 정렬
            else
                right = pivotIdx - 1;
        }
        return Arrays.copyOf(points, k);
    }

    int partition(int[][] points, int left, int right) {
        // 기준값
        int[] pivot = points[left + (right - left) / 2];
        // 끝지점
        int pivotDist = distance(pivot);

        while(left < right) {

            if(distance(points[left]) >= pivotDist) {
                swap(points, left, right);
                right--;
            } else {
                left++;
            }
        }

        if(distance(points[left]) < pivotDist)
            left++;
        return left;
    }

    void swap(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
