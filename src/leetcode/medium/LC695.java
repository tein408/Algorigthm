package leetcode.medium;

public class LC695 {

    boolean[][] visit;
    int n, m;

    public int maxAreaOfIsland(int[][] grid) {
        n = grid.length;
        m = grid[0].length;

        visit = new boolean[n][m];

        int ans = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(!visit[i][j] && grid[i][j] == 1) {
                    ans = Math.max(ans, dfs(grid, i, j));
                }
            }
        }
        return ans;
    }

    int dfs(int[][] grid, int x, int y) {
        if(x<0 || y<0 || x>grid.length-1 || y> grid[0].length-1)
            return 0;

        if(visit[x][y] || grid[x][y] == 0)
            return 0;

        visit[x][y] = true;

        return 1 + dfs(grid, x-1, y) + dfs(grid, x+1, y) + dfs(grid, x, y-1) + dfs(grid, x, y+1);

    }

}
