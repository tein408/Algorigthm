package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P15829 {

    static long m = 1234567891;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        long result = 0;

        for(int i=0; i<l; i++) {
            result += (str.charAt(i) - 'a' + 1) * pow(31, i);
        }

        System.out.println(result%m);

    }

    static long pow(int a, int b) {
        return b==0? 1: a * pow(a, b-1) % m;
    }

}