package leetcode.easy;

public class LC2022 {

    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n)
            return new int[][] {};

        int[][] answer = new int[m][n];

        for(int i=0; i<original.length; i++) {
            answer[i/n][i%n] = original[i];
        }
        return answer;
    }

}
