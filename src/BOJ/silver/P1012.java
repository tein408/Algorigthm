package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1012 {

    static int n, m, k;
    static int[][] arr;
    static boolean[][] visit;
    static int cnt;

    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(bf.readLine());

        while(t-- > 0) {

            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            arr = new int[m][n];
            visit = new boolean[m][n];

            for(int i=0; i<k; i++) {
                st = new StringTokenizer(bf.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[a][b] = 1;
            }

            cnt = 0;

            for(int i=0; i<m; i++) {
                for(int j=0; j<n; j++) {
                    if(!visit[i][j] && arr[i][j] == 1) {
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

        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < m && ny < n) {
                if(arr[nx][ny] == 1 && !visit[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }


}
