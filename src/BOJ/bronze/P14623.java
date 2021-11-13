package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P14623 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(bf.readLine(), 2);
        BigInteger b = new BigInteger(bf.readLine(), 2);

        a = a.multiply(b);

        String res = a.toString(2);
        System.out.println(res);
    }
}
