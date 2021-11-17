package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2740 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[n][m];


        for(int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            for(int j=0; j<m; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(bf.readLine(), " ");
        st.nextToken();
        int k = Integer.parseInt(st.nextToken());
        int[][] arr2 = new int[m][k];

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            for(int j=0; j<k; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] re = new int[n][k];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int temp = arr1[i][j];
                for(int h=0; h<k; h++){
                    re[i][h] += temp * arr2[j][h];
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<k; j++){
                System.out.print(re[i][j] + " ");
            }
            System.out.println();
        }

    }
}
