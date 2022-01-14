package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1992 {

    static int[][] map;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        map = new int[n][n];

        for(int i=0; i<n; i++) {
            String str = bf.readLine();
            for(int j=0; j<n; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        quadTree(0, 0, n);
        System.out.println(sb);
    }

    static void quadTree(int x, int y, int oldSize) {
        if(oldSize == 1) {
            sb.append(map[x][y]);
            return;
        }

        int size = oldSize/2;
        int val = map[x][y];

        for(int i=x; i<x+oldSize; i++) {
            for(int j=y; j<y+oldSize; j++) {
                if(val != map[i][j]) {
                    sb.append('(');
                    quadTree(x, y, size);
                    quadTree(x, y + size, size);
                    quadTree(x + size, y, size);
                    quadTree(x + size, y + size, size);
                    sb.append(')');
                    return;
                }
            }
        }

        sb.append(val);
    }
}
