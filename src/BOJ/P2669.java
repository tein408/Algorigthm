package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2669 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] arr = new int[101][101];
        int sum = 0;

        for(int i=0; i<4; i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            for(int j=a; j<c; j++) {
                for(int k=b; k<d; k++) {
                    arr[j][k]++;
                }
            }
        }

        for(int i=0; i<101; i++) {
            for(int j=0; j<101; j++) {
                if(arr[i][j] > 0)
                    sum++;
            }
        }

        System.out.println(sum);

    }
}
