package leetcode.medium;

public class LC221 {

    public int maximalSquare(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[301][301];
        int ans = Integer.MIN_VALUE;

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(i == 0 || j == 0 || matrix[i][j] == '0')
                    dp[i][j] = matrix[i][j] - '0';
                else {
                    int a = Math.min(dp[i][j-1], dp[i-1][j]);
                    int b = Math.min(a, dp[i-1][j-1]);
                    dp[i][j] = b + 1;
                }
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans * ans;
    }

}
