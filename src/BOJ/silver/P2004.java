package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2004 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Long n = Long.parseLong(st.nextToken());
        Long m = Long.parseLong(st.nextToken());

        long five = five(n) - five(n-m) - five(m);
        long two = two(n) - two(n-m) - two(m);

        System.out.println(Math.min(five, two));

    }

    static long five(long n) {
        int cnt = 0;
        while(n >= 5) {
            cnt += (n/5);
            n /= 5;
        }
        return cnt;
    }

    static long two(long n) {
        int cnt = 0;
        while(n >=2 ) {
            cnt += (n/2);
            n /= 2;
        }
        return cnt;
    }
}
