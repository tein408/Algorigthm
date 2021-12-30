package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P10826 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        if(n == 0)
            System.out.println(0);
        else if(n==1)
            System.out.println(1);
        else {
            BigInteger[] fibo = new BigInteger[10001];
            fibo[0] = BigInteger.ZERO;
            fibo[1] = BigInteger.ONE;

            for(int i=2; i<=n; i++) {
                fibo[i] = fibo[i-1].add(fibo[i-2]);
            }

            System.out.println(fibo[n]);
        }
    }
}
