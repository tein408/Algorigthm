package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1934 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bf.readLine());

        for(int i=0; i<t; i++) {
            String temp = bf.readLine();
            int a = Integer.parseInt(temp.split(" ")[0]);
            int b = Integer.parseInt(temp.split(" ")[1]);

            System.out.println(a*b / gcd(a,b));

        }

    }

    static int gcd(int a, int b) {
        if(a%b==0) return b;
        return gcd(b, a%b);
    }

}
