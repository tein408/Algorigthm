package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P15873 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int a, b;
        if(n%100 > 10 && n%100 < 100) {
            a = n/10;
            b = n%10;
        }
        else if(n%100 < 10) {
            a = 10;
            b = n%100;
        }
        else if(n%100 == 10) {
            a = n/100;
            b = 10;
        }
        else {
            a = 10;
            b = 10;
        }

        System.out.println(a+b);

    }
}
