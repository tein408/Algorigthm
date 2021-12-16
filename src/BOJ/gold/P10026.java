package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P10026 {

    static int n;
    static char[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        map = new char[n][n];
        visit = new boolean[n][n];

        for(int i=0; i<n; i++) {
            String temp = bf.readLine();
            for(int j=0; j<n; j++) {
                map[i][j] = temp.charAt(j);
            }
        }

        int[] ans = {0, 0};
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(!visit[i][j]) {
                    cntMap(i, j, map[i][j]);
                    ans[0]++;
                }
                if(map[i][j] == 'G')
                    map[i][j] = 'R';
            }
        }

        visit = new boolean[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(!visit[i][j]) {
                    cntMap(i, j, map[i][j]);
                    ans[1]++;
                }
            }
        }

        System.out.println(ans[0] + " " + ans[1]);

    }

    static void cntMap(int x, int y, char current) {
        visit[x][y] = true;

        for(int i=0; i<4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= n) {
                continue;
            }
            if(visit[nextX][nextY])
                continue;

            if(map[nextX][nextY] == current){
                cntMap(nextX, nextY, current);
            }

        }
    }


}
