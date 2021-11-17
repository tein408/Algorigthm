package leetcode.medium;

import java.util.Arrays;

public class LC378 {

    /*public int kthSmallest(int[][] matrix, int k) {
        int len = matrix.length * matrix[0].length;
        int[] arr = new int[len];

        int idx = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                arr[idx++] = matrix[i][j];
            }
        }

        Arrays.sort(arr);
        return arr[k-1];
    }*/

    //개선
    public static int kthSmallest(int[][] matrix, int k) {
        int a = matrix.length;
        int b = matrix[0].length;
        int left = matrix[0][0];
        int right = matrix[a-1][b-1];
        int mid;

        while(left <= right) {
            mid = left + (right - left) / 2;
            int cnt = 0;
            int j = b-1;

            for(int i=0; i<a; i++) {
                while(j >= 0 && matrix[i][j] > mid) {
                    j--;
                }
                cnt += (j+1);
            }

            if(cnt < k)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,5,9}, {10,11,13}, {12,13,15}};
        System.out.println(kthSmallest(matrix, 8));
    }

}
