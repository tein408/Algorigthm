package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P16486 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());

        System.out.printf("%.6f\n", 2*a + 2*Math.PI*b);

    }
}
