package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2630 {

    static int n, white = 0, blue = 0;
    static int[][] map;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        map = new int[n][n];

        StringTokenizer st;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            for(int j=0; j<n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        paper(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }

    static void paper(int x, int y, int size) {
        if(color(x, y, size)) {
            if(map[x][y] == 0)
                white++;
            else
                blue++;
            return;
        }
        int nextSize = size/2;
        paper(x, y, nextSize);
        paper(x, y + nextSize, nextSize);
        paper(x + nextSize, y, nextSize);
        paper(x + nextSize, y + nextSize, nextSize);
    }

    static boolean color(int x, int y, int size) {
        int start = map[x][y];

        for(int i=x; i<x+size; i++) {
            for(int j=y; j<y+size; j++) {
                if(start != map[i][j])
                    return false;
            }
        }
        return true;
    }

}
