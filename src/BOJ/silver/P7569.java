package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P7569 {

    static int n, m, h;
    static int[][][] map;
    static Queue<Box> que;
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        map = new int[h][n][m];
        que = new LinkedList<>();

        for(int k=0; k<h; k++) {
            for(int i=0; i<n; i++) {
                st = new StringTokenizer(bf.readLine(), " ");
                for(int j=0; j<m; j++) {
                    map[k][i][j] = Integer.parseInt(st.nextToken());
                    if(map[k][i][j] == 1)
                        que.add(new Box(k, i, j));
                }
            }
        }

        bfs();
    }

    static void bfs() {
        while(!que.isEmpty()) {
            Box b = que.poll();
            int x = b.x;
            int y = b.y;
            int z = b.z;

            for(int i=0; i<6; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                int nextZ = z + dz[i];

                if(nextX >= 0 && nextY >= 0 && nextZ >= 0 && nextX < n && nextY < m && nextZ < h) {
                    if(map[nextZ][nextX][nextY] == 0) {
                        que.add(new Box(nextZ, nextX, nextY));
                        map[nextZ][nextX][nextY] = map[z][x][y] + 1;
                    }
                }
            }
        }

        int date = Integer.MIN_VALUE;
        for(int i=0; i<h; i++) {
            for(int j=0; j<n; j++) {
                for(int k=0; k<m; k++) {
                    if(map[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    date = Math.max(date, map[i][j][k]);
                }
            }
        }
        System.out.println(date-1);
    }

}

class Box {
    int x, y, z;

    public Box(int z, int x, int y) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
