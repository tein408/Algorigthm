package leetcode.medium;

public class LC695 {

    boolean[][] visit;

    int n, m, cnt;

    int dx[] = {-1,1,0,0};
    int dy[] = {0,0,-1,1};

    public int maxAreaOfIsland(int[][] grid) {
        n = grid.length;
        m = grid[0].length;

        visit = new boolean[n][m];

        int ans = 0;
        cnt = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                cnt = 0;
                if(!visit[i][j] && grid[i][j] == 1) {
                    cnt++;
                    dfs(grid, i, j);
                    ans = Math.max(cnt, ans);
                }
            }
        }
        return ans;
    }

    void dfs(int[][] grid, int x, int y) {
        visit[x][y] = true;

        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if(grid[nx][ny] == 1 && !visit[nx][ny]) {
                    dfs(grid, nx, ny);
                    cnt++;
                }
            }
        }
    }

}
