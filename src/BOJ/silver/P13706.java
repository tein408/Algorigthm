package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P13706 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(bf.readLine());
        System.out.println(n.sqrt());
    }
}
