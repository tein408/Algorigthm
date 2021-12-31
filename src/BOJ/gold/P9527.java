package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P9527 {

    static long[] bit = new long[56];

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long ans = 0;

        bit[0] = 1;
        for(int i=1; i<=55; i++) {
            bit[i] = 2 * bit[i-1] + (1L << i);
        }

        ans = cnt(b) - cnt(a-1);

        System.out.println(ans);
    }

    static long cnt(long n) {
        long res = n & 1;
        for(int i=54; i>0; i--) {
            if((n & (1L << i)) > 0L) {
                res += bit[i-1] + n - (1L << i) + 1;
                n -= (1L << i);
            }
        }

        return res;
    }

}

