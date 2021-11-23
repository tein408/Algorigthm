package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4963 {

    static int w, h, cnt;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0, -1, 1, -1, 1};
    static int[] dy = {0, 0, -1, 1, -1, 1, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        while(true) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if(w == 0 && h == 0)
                break;

            map = new int[h][w];
            visit = new boolean[h][w];

            for(int i=0; i<h; i++) {
                st = new StringTokenizer(bf.readLine(), " ");
                for(int j=0; j<w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            cnt = 0;

            for(int i=0; i<h; i++) {
                for(int j=0; j<w; j++) {
                    if(map[i][j] == 1 && !visit[i][j]) {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }

            sb.append(cnt).append("\n");

        }

        System.out.println(sb);

    }

    static void dfs(int x, int y) {
        visit[x][y] = true;

        for(int i=0; i<8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < h && ny < w) {
                if(map[nx][ny] == 1 && !visit[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
