package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class LC1926 {

    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> que = new LinkedList<>();
        boolean[][] visit = new boolean[m][n];
        que.add(entrance);
        visit[entrance[0]][entrance[1]] = true;

        int cnt = 0;

        while(!que.isEmpty()) {
            int size = que.size();
            cnt++;

            for(int j=0; j<size; j++) {
                int[] poll = que.poll();
                int currX = poll[0];
                int currY = poll[1];

                for(int i=0; i<4; i++) {
                    int nextX = currX + dx[i];
                    int nextY = currY + dy[i];

                    if(isExit(nextX, nextY, maze) && maze[nextX][nextY] == '.' && !visit[nextX][nextY]) {
                        if(check(nextX, nextY, maze))
                            return cnt;
                        que.add(new int[] {nextX, nextY});
                        visit[nextX][nextY] = true;
                    }
                }
            }
        }
        return -1;
    }

    boolean check(int x, int y, char[][] maze) {
        return x == 0 || y == 0 || x == maze.length - 1 || y == maze[0].length - 1;
    }

    boolean isExit(int x, int y, char[][] maze) {
        return x >= 0 && y >= 0 && x < maze.length && y < maze[0].length;
    }

}
