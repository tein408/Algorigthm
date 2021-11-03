package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1236 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[n][m];

        int ans = 0;
        int row = 0, col = 0;

        for(int i=0; i<n; i++) {
            String str = bf.readLine();
            for(int j=0; j<m; j++) {
                char c = str.charAt(j);
                arr[i][j] = c;
            }
        }

        for(int i=0; i<n; i++) {
            boolean chk = true;
            for(int j=0; j<m; j++) {
                if(arr[i][j] == 'X') {
                    chk = false;
                    break;
                }
            }
            if(chk)
                row++;
        }

        for(int i=0; i<m; i++) {
            boolean chk = true;
            for(int j=0; j<n; j++) {
                if(arr[j][i] == 'X') {
                    chk = false;
                    break;
                }
            }
            if(chk)
                col++;
        }

        ans = Math.max(row, col);
        System.out.println(ans);

    }
}
