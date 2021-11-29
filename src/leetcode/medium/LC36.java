package leetcode.medium;

import java.util.HashSet;

public class LC36 {

    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            HashSet<Character> box = new HashSet<>();
            for(int j=0; j<9; j++) {
                if(board[i][j] != '.' && !row.add(board[i][j]))
                    return false;
                if(board[j][i] != '.' && !col.add(board[j][i]))
                    return false;
                int r = 3 * (i/3) + j/3;
                int c = 3 * (i%3) + j%3;
                if(board[r][c] != '.' && !box.add(board[r][c]))
                    return false;
            }
        }
        return true;
    }

}
