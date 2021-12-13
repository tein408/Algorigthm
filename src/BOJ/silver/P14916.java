package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14916 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int cnt = 0;

        while(true) {
            if(n % 5 == 0) {
                cnt += n / 5;
                break;
            }
            else if(n < 0) {
                System.out.println(-1);
                return;
            }
            else if(n == 0)
                break;

            n -= 2;
            cnt++;
        }

        System.out.println(cnt);

    }
}
