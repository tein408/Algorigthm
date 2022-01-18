package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12865 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] sack = new int[n+1][k+1];
        int[] weight = new int[n+1];
        int[] value = new int[n+1];
        int max = 0;

        for (int i=1; i<=n; i++) {
            st = new StringTokenizer(bf.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=1; i<=n; i++) {
            for(int j=1; j<=k; j++) {
                if(weight[i] <= j)
                    sack[i][j] = Math.max(value[i] + sack[i - 1][j - weight[i]], sack[i - 1][j]);
                else
                    sack[i][j] = sack[i - 1][j];
                max = Math.max(max, sack[i][j]);
            }
        }
        System.out.println(max);

    }
}
