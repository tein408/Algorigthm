package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class P5893 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        BigInteger a = new BigInteger(str, 2);
        a = a.multiply(new BigInteger("17"));

        String temp = a.toString(2);
        System.out.println(temp);

    }
}
