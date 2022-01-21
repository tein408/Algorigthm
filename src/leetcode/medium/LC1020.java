package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class LC1020 {

    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> que = new LinkedList<>();

        for (int i=0; i<m; i++) {
            if(grid[i][0] == 1) {
                que.offer(new int[] {i, 0});
            }
            if(grid[i][n-1] == 1) {
                que.offer(new int[] {i, n-1});
            }
        }

        for (int j=0; j<n; j++) {
            if(grid[0][j] == 1) {
                que.offer(new int[] {0, j});
            }
            if(grid[m-1][j] == 1) {
                que.offer(new int[] {m-1, j});
            }
        }

        while (!que.isEmpty()) {
            int[] curr = que.poll();
            int x = curr[0];
            int y = curr[1];

            if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] != 1) {
                continue;
            }

            grid[x][y] = 2;

            for (int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                que.offer(new int[] {nx, ny});
            }

        }

        int count = 0;

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if(grid[i][j] == 1)
                    count++;
            }
        }

        return count;
    }

}
