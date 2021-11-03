package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P21567 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(bf.readLine());
        BigInteger b = new BigInteger(bf.readLine());
        BigInteger c = new BigInteger(bf.readLine());

        BigInteger aa = a.multiply(b);
        String str = aa.multiply(c) + "";

        int[] arr = new int[10];
        for(int i=0; i<str.length(); i++) {
            int temp = str.charAt(i) - '0';
            arr[temp]++;
        }

        for(int i : arr)
            System.out.println(i);

    }
}
