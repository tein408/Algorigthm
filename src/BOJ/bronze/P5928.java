package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5928 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int d = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int t1 = d * 24 * 60 + h * 60 + m;
        int t2 = 11 * 24 * 60 + 11 * 60 + 11;

        if(t1 - t2 < 0)
            System.out.println(-1);
        else
            System.out.println(t1 - t2);

    }
}
