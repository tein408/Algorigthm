package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1748 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bf.readLine());

        int cnt = 0, carry = 1, num = 10;

        for(int i=1; i<=n; i++) {
            if(i%num == 0) {
                carry++;
                num *= 10;
            }
            cnt += carry;
        }

        System.out.println(cnt);
    }
}
