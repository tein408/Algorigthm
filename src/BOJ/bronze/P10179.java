package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10179 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while(t-- > 0) {
            double a = Double.parseDouble(bf.readLine());
            double res = a*0.8;
            System.out.printf("$%.2f\n", res);
        }
    }
}
