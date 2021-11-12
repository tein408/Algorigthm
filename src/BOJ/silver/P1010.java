package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1010 {

    static double calc(double x, double y) {
        double a=1;
        double b=1;
        for(double i=x; i>x-y; i--)
            a = a * i;
        for(double i=y; i>0; i--)
            b = b * i;
        return a/b;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(bf.readLine());

        while(t-- > 0) {

            st = new StringTokenizer(bf.readLine(), " ");
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            //부동소수점 ..ㅠㅠ
            System.out.printf("%.0f\n", calc(b, a));

        }
    }
}
