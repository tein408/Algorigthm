package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2178 {

    static int[][] map;
    static int n, m;
    static boolean[][] visit;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visit = new boolean[n][m];

        for(int i=0; i<n; i++) {
            String str = bf.readLine();
            for(int j=0; j<m; j++) {
                map[i][j] = str.charAt(j) - '0';
                visit[i][j] = false;
            }
        }

        visit[0][0] = true;
        findPath(0, 0);
        System.out.println(map[n-1][m-1]);
    }

    static void findPath(int x, int y) {
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{x, y});

        while(!que.isEmpty()) {
            int curr[] = que.poll();
            int currX = curr[0], currY = curr[1];

            for(int i=0; i<4; i++) {
                int nextX = currX + dx[i];
                int nextY = currY + dy[i];

                if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= m)
                    continue;
                if(visit[nextX][nextY] || map[nextX][nextY] == 0)
                    continue;

                //방문할 좌표 큐에 넣고
                //다음 좌표는 현재좌표 + 1
                //다음 좌표 방문 표시
                que.add(new int[] {nextX, nextY});
                map[nextX][nextY] = map[currX][currY] + 1;
                visit[nextX][nextY] = true;
            }
        }
    }

}
