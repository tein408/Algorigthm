package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2589 {

    static int n, m;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<Point> que;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        for(int i=0; i<n; i++) {
            String str = bf.readLine();
            for(int j=0; j<m; j++) {
                if(str.charAt(j) == 'L')
                    map[i][j] = 1;
            }
        }

        int max = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(map[i][j] == 1) {
                    visit = new boolean[n][m];
                    int len = bfs(i, j);
                    max = Math.max(max, len);
                }
            }
        }

        System.out.println(max);

    }

    static int bfs(int x, int y) {
        que = new LinkedList<>();
        que.offer(new Point(x, y, 0));
        visit[x][y] = true;

        int len = 0;

        while(!que.isEmpty()) {
            Point poll = que.poll();

            for(int i=0; i<4; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                if(!visit[nx][ny] && map[nx][ny] == 1) {
                    que.offer(new Point(nx, ny, poll.cnt+1));
                    len = Math.max(len, poll.cnt+1);
                    visit[nx][ny] = true;
                }
            }

        }

        return len;
    }

}

class Point {
    int x, y, cnt;

    public Point(int x, int y, int cnt) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}
