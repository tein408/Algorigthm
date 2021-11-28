package BOJ.platinum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P3197 {

    static int r, c, day = 0;
    static char[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Swan[] swans = new Swan[2];
    static Queue<int[]> water = new LinkedList<>();
    static Queue<int[]> path = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new char[r][c];
        visit = new boolean[r][c];

        int idx = 0;
        for(int i=0; i<r; i++) {
            String str = bf.readLine();
            for(int j=0; j<c; j++) {
                map[i][j] = str.charAt(j);
                if(map[i][j] == 'L') {
                    map[i][j] = '.';
                    swans[idx++] = new Swan(i, j);
                }
                if(map[i][j] == '.')
                    water.add(new int[]{i, j});
            }
        }

        path.add(new int[] {swans[0].x, swans[0].y});
        visit[swans[0].x][swans[0].y] = true;

        while(true) {
            if(findPath())
                break;
            water();
            day++;
        }

        System.out.println(day);

    }

    //얼음->물
    static void water() {
        int size = water.size();
        for(int j=0; j<size; j++) {
            int[] curr = water.poll();
            int x = curr[0], y = curr[1];

            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && ny >= 0 && nx < r && ny < c) {
                    if(map[nx][ny] == 'X') {
                        water.add(new int[] {nx, ny});
                        map[nx][ny] = '.';
                    }
                }
            }
        }
    }

    //백조 길찾기
    static boolean findPath() {
        Queue<int[]> next = new LinkedList<>();
        while(!path.isEmpty()) {
            int[] a = path.poll();
            Swan b = swans[1];

            if(a[0] == b.x && a[1] == b.y)
                return true;

            for(int i=0; i<4; i++) {
                int nx = a[0] + dx[i];
                int ny = a[1] + dy[i];

                if(nx >= 0 && ny >= 0 && nx < r && ny < c && !visit[nx][ny]) {
                    visit[nx][ny] = true;
                    if(map[nx][ny] == '.') {
                        path.add(new int[]{nx, ny});
                    }
                    else if(map[nx][ny] == 'X') {
                        next.add(new int[]{nx, ny});
                    }
                }
            }
        }
        path = next;
        return false;
    }

}

class Swan {
    int x, y;

    public Swan(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
