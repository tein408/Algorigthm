package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P14264 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(bf.readLine());
        double ans = n * n * Math.sqrt(3) / 4;
        System.out.printf("%.10f\n", ans);
    }
}
