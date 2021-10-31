package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1629 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        System.out.println(solv(a, b, c));
    }

    static long solv(long a, long b, long c) {
        //모듈러 합동 공식
        // (a * b) % c = (a%c * b%c) % c

        if(b == 1) return a%c;

        long temp = solv(a, b/2, c);

        if(b%2 == 1)
            return (temp * temp % c) * a%c;
        else
            return temp * temp % c;
    }

}
