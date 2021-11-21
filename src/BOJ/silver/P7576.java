package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P7576 {

    static int n, m;
    static int[][] arr;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };
    static Queue<int[]> que;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        que = new LinkedList<>();

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            for(int j=0; j<m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1)
                    que.add(new int[]{i, j});
            }
        }

        bfs();

    }

    static void bfs() {
        while(!que.isEmpty()) {
            int[] curr = que.poll();
            int x = curr[0], y = curr[1];

            for(int i=0; i<4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < m) {
                    if(arr[nextX][nextY] == 0) {
                        que.add(new int[]{nextX, nextY});
                        arr[nextX][nextY] = arr[x][y] + 1;
                    }
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(arr[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, arr[i][j]);
            }
        }
        System.out.println(max-1);
    }

}