package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3053 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double r = Double.parseDouble(bf.readLine());
        double c1 = Math.PI * r * r;
        double c2 = 2 * r * r;

        System.out.printf("%.6f\n", c1);
        System.out.printf("%.6f", c2);

    }
}
