package leetcode.medium;

import java.util.Arrays;

public class LC136 {

    public int kthSmallest(int[][] matrix, int k) {
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
    }

}
