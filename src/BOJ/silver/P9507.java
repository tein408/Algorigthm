package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9507 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(bf.readLine());

        long[] kong = new long[68];
        kong[0] = 1;
        kong[1] = 1;
        kong[2] = 2;
        kong[3] = 4;
        for(int i=4; i<68; i++) {
            kong[i] = kong[i-1] + kong[i-2] + kong[i-3] + kong[i-4];
        }

        while(t-- > 0) {

            int n = Integer.parseInt(bf.readLine());
            sb.append(kong[n]).append("\n");

        }

        System.out.println(sb);
    }
}
