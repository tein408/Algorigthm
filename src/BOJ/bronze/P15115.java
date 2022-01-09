package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15115 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        double k = Integer.parseInt(st.nextToken());
        double p = Integer.parseInt(st.nextToken());
        double x = Integer.parseInt(st.nextToken());

        long m = Math.round(Math.sqrt(k * p / x));
        double mny = k * p / m + m * x;
        System.out.printf("%.3f", mny);

    }
}
