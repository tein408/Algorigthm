package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P8437 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger total = new BigInteger(bf.readLine());
        BigInteger k = new BigInteger(bf.readLine());

        BigInteger add = total.add(k);
        add = add.divide(new BigInteger("2"));
        BigInteger minus = total.subtract(k);
        minus = minus.divide(new BigInteger("2"));

        System.out.println(add);
        System.out.println(minus);
    }
}
