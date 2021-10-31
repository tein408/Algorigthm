package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2738 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] res = new int[n][m];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            for(int j=0; j<m; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            for(int j=0; j<m; j++) {
                res[i][j] = arr1[i][j] + Integer.parseInt(st.nextToken());
                sb.append(res[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
