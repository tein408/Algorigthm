package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P1271 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String temp = bf.readLine();
        BigInteger n = new BigInteger(temp.split(" ")[0]);
        BigInteger m = new BigInteger(temp.split(" ")[1]);

        System.out.println(n.divide(m));
        System.out.println(n.mod(m));


    }
}
