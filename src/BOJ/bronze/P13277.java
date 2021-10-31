package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class P13277 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        BigInteger num1 = new BigInteger(st.nextToken());
        BigInteger num2 = new BigInteger(st.nextToken());
        System.out.println(num1.multiply(num2));
    }
}
