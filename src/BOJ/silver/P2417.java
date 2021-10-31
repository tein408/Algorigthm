package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2417 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(bf.readLine());

        long sqrt = (long) Math.sqrt(n);

        if(sqrt * sqrt == n) {
            System.out.println(sqrt);
        }
        else {
            System.out.println(sqrt + 1);
        }

    }
}
