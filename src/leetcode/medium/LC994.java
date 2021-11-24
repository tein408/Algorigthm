package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class LC994 {

    public int orangesRotting(int[][] grid) {
        Queue<int[]> que = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int row = grid.length;
        int column = grid[0].length;

        if(row == 1 && column == 1) {
            if(grid[0][0] == 0 || grid[0][0] == 2)
                return 0;
            if(grid[0][0] == 1)
                return -1;
        }

        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                if(grid[i][j] == 2)
                    que.add(new int[]{i, j});
            }
        }

        while(!que.isEmpty()) {
            int[] curr = que.poll();
            int x = curr[0], y = curr[1];

            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && ny >= 0 && nx < row && ny < column) {
                    if(grid[nx][ny] == 1) {
                        que.add(new int[]{nx, ny});
                        grid[nx][ny] = grid[x][y] + 1;
                    }
                }
            }
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                if(grid[i][j] == 1)
                    return -1;
                max = Math.max(max, grid[i][j]);
            }
        }

        return max > 0 ? max - 2 : max;
    }


}
