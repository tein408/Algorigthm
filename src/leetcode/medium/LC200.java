package leetcode.medium;

public class LC200 {

    int n, m;
    boolean[][] visit;
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;

        int cnt = 0;
        visit = new boolean[m][n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] == '1' && !visit[i][j]) {
                    search(grid, i, j);
                    cnt++;
                }
            }
        }

        return cnt;
    }

    void search(char[][] grid, int x, int y) {
        visit[x][y] = true;
        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < m && ny < n) {
                if(grid[nx][ny] == '1' && !visit[nx][ny])
                    search(grid, nx, ny);
            }
        }
    }

}
