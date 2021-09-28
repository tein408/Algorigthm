package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class P2824 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");

        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++) {
            a = a.multiply(new BigInteger(st.nextToken()));
        }

        n = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++) {
            b = b.multiply(new BigInteger(st.nextToken()));
        }

        String result = a.gcd(b).toString();

        System.out.println(result.length()>9? result.substring(result.length()-9, result.length()):result);

    }

}
