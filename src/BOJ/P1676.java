package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1676 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int cnt = 0;

        while(n >= 5) {
            cnt += n/5;
            n/=5;
        }
        System.out.println(cnt);

    }

}
