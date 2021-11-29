package leetcode.medium;

public class LC74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        if(m == 0)
            return false;

        int left = 0, right = n*m - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;

            int rowIdx = mid / n;
            int colIdx = mid % n;

            if(matrix[rowIdx][colIdx]  == target) {
                return true;
            } else if(matrix[rowIdx][colIdx] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

}
