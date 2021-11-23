package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P7562 {

    static int n;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int t = Integer.parseInt(bf.readLine());

        while(t-- > 0) {
            n = Integer.parseInt(bf.readLine());

            map = new int[n][n];
            visit = new boolean[n][n];

            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b]++;

            st = new StringTokenizer(bf.readLine(), " ");
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int ans = bfs(a, b, c, d) - 1;
            sb.append(ans).append("\n");

        }

        System.out.println(sb);

    }

    static int bfs(int x, int y, int c, int d) {
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{x, y});
        visit[x][y] = true;

        while(!que.isEmpty()) {
            int[] poll = que.poll();

            if(poll[0] == c && poll[1] == d)
                return map[poll[0]][poll[1]];

            for(int i=0; i<8; i++) {
                int nx = poll[0] + dx[i];
                int ny = poll[1] + dy[i];

                if(nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if(!visit[nx][ny]) {
                        visit[nx][ny] = true;
                        map[nx][ny] = map[poll[0]][poll[1]] + 1;
                        que.add(new int[] {nx, ny});
                    }
                }
            }
        }
        return -1;
    }

}
