package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class LC566 {

    //List 사용하여 풀이
/*    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int len = mat.length * mat[0].length;
        int temp = r * c;

        if(len != temp) {
            return mat;
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                list.add(mat[i][j]);
            }
        }

        int[][] ans = new int[r][c];

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                ans[i][j] = list.get(i*c + j);
            }
        }

        return ans;
    }*/

    //hint 6 이용한 풀이
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;

        if(n * m != r * c) {
            return mat;
        }

        int[][] ans = new int[r][c];

        for(int i=0; i<r*c; i++) {
            ans[i/c][i%c] = mat[i/m][i%m];
        }
        return ans;
    }

}
