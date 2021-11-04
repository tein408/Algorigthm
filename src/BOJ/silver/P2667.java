package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P2667 {

    static int[][] arr;
    static boolean[][] visit;
    static int n;
    static int cnt;

    // dx, dy = 상하좌우
    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};

    static ArrayList<Integer> list;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bf.readLine());

        arr = new int[n][n];
        visit = new boolean[n][n];
        list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            String str = bf.readLine();
            for(int j=0; j<n; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(!visit[i][j] && arr[i][j] == 1) {
                    cnt = 1;
                    dfs(i, j);
                    list.add(cnt);
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(int i : list)
            System.out.println(i);

    }

    static int dfs(int x, int y) {
        visit[x][y] = true;

        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if(arr[nx][ny] == 1 && !visit[nx][ny]) {
                    dfs(nx, ny);
                    cnt++;
                }
            }
        }
        return cnt;
    }

}
