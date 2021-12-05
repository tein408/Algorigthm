package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class P2407 {
    
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        BigInteger c = BigInteger.ONE;
        BigInteger d = BigInteger.ONE;

        for(int i=0; i<b; i++) {
            c = c.multiply(new BigInteger(String.valueOf(a-i)));
            d = d.multiply(new BigInteger(String.valueOf(i+1)));
        }

        System.out.println(c.divide(d));
        
    }

}
