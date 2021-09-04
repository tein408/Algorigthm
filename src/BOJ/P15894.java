package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //BigInteger number = new BigInteger(bf.readLine());
        //System.out.println(number.multiply(new BigInteger("4")));

        long num = Long.parseLong(bf.readLine());
        System.out.println(num*4);

    }
}
