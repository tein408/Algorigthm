package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1850 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long result = gcd(a,b);

        StringBuilder sb = new StringBuilder();

        for(long i = 0; i<result; i++) {
            sb.append("1");
        }
        System.out.println(sb.toString());

    }

    public static long gcd(long m, long n) {
        if(m%n == 0) return n;
        else return gcd(n%m, m);
    }

}
