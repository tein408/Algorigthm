package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2096 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[][] max = new int[n][3];
        int[][] min = new int[n][3];

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (i == 0) {
                max[i][0] = min[i][0] = a;
                max[i][1] = min[i][1] = b;
                max[i][2] = min[i][2] = c;
            } else {
                max[i][0] += Math.max(max[i-1][0], max[i-1][1]) + a;
                max[i][1] += Math.max(Math.max(max[i-1][0], max[i-1][1]), max[i-1][2]) + b;
                max[i][2] += Math.max(max[i-1][1], max[i-1][2]) + c;

                min[i][0] += Math.min(min[i-1][0], min[i-1][1]) + a;
                min[i][1] += Math.min(Math.min(min[i-1][0], min[i-1][1]), min[i-1][2]) + b;
                min[i][2] += Math.min(min[i-1][1], min[i-1][2]) + c;
            }

        }

        System.out.print(Math.max(Math.max(max[n-1][0], max[n-1][1]), max[n-1][2]));
        System.out.println(" " + Math.min(Math.min(min[n-1][0], min[n-1][1]), min[n-1][2]));
    }
}
