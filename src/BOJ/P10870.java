package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10870 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        System.out.println(fibo(num));

    }

    static int fibo(int n) {
        if(n==0) {
            return 0;
        } else if(n==1) {
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }

}
