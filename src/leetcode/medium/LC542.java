package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class LC542 {

    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int column = mat[0].length;
        boolean[][] visit = new boolean[row][column];

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> que = new LinkedList<>();

        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                if(mat[i][j] != 1)
                    que.add(new int[]{i, j});
            }
        }

        while(!que.isEmpty()) {
            int[] poll = que.poll();
            int x = poll[0], y = poll[1];

            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && ny >= 0 && nx < row && ny < column && !visit[nx][ny]) {
                    if(mat[nx][ny] == 1) {
                        visit[nx][ny] = true;
                        que.add(new int[]{nx, ny});
                        mat[nx][ny] = mat[x][y] + 1;
                    }
                }
            }
        }
        return mat;
    }
}
