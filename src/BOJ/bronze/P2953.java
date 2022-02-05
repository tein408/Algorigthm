package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2953 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int max = 0, idx = 0;

        for(int i=1; i<6; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            int point = Integer.parseInt(st.nextToken());
            point += Integer.parseInt(st.nextToken());
            point += Integer.parseInt(st.nextToken());
            point += Integer.parseInt(st.nextToken());

            if(point > max) {
                max = point;
                idx = i;
            }
        }

        System.out.println(idx + " " + max);
    }
}
