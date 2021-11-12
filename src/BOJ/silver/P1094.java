package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1094 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int cnt = 0, stick = 64;

        while(n > 0) {
            if(stick > n)
                stick /= 2;
            else {
                cnt++;
                n-=stick;
            }
        }

        System.out.println(cnt);

    }
}
