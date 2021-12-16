package softeer.level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Softeer583GiniHelp {
    static int r, c, cnt;
    static int[] home;
    static char[][] map;
    static boolean[][] taebumVisit;
    static boolean[][] rainVisit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<int[]> taebum = new LinkedList<>();
    static Queue<int[]> rain = new LinkedList<>();

    public static void main(String args[]) throws Exception
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new char[r][c];
        taebumVisit = new boolean[r][c];
        rainVisit = new boolean[r][c];

        for(int i=0; i<r; i++) {
            String temp = bf.readLine();
            for(int j=0; j<c; j++) {
                map[i][j] = temp.charAt(j);
                if(map[i][j] == 'W') {
                    taebumVisit[i][j] = true;
                    taebum.add(new int[] {i, j});
                }
                if(map[i][j] == 'H') {
                    home = new int[] {i, j};
                }
                if(map[i][j] == '*') {
                    rain.add(new int[] {i, j});
                }
            }
        }

        cnt = 0;
        findPath();

    }

    static void rainMoving() {
        int size = rain.size();
        for(int j=0; j<size; j++) {
            int[] curr = rain.poll();

            for(int i=0; i<4; i++) {
                int nextX = curr[0] + dx[i];
                int nextY = curr[1] + dy[i];

                if(nextX < 0 || nextY < 0 || nextX >= r || nextY >= c)
                    continue;
                if(rainVisit[nextX][nextY] || map[nextX][nextY] == 'H')
                    continue;
                if(map[nextX][nextY] == 'X')
                    continue;

                rainVisit[nextX][nextY] = true;
                rain.add(new int[] {nextX, nextY});
            }
        }
    }

    static void findPath() {
        while(!taebum.isEmpty()) {

            rainMoving();

            int tSize = taebum.size();
            while(tSize-- > 0) {
                int[] curr = taebum.poll();

                if(curr[0] == home[0] && curr[1] == home[1]) {
                    System.out.println(cnt);
                    return;
                }

                for(int i=0; i<4; i++) {
                    int nextX = curr[0] + dx[i];
                    int nextY = curr[1] + dy[i];

                    if(nextX < 0 || nextY < 0 || nextX >= r || nextY >= c)
                        continue;
                    if(taebumVisit[nextX][nextY] || rainVisit[nextX][nextY])
                        continue;
                    if(map[nextX][nextY] == 'X')
                        continue;

                    taebumVisit[nextX][nextY] = true;
                    taebum.add(new int[] {nextX, nextY});

                }
            }
            cnt++;
        }
        System.out.println("FAIL");
    }
}
