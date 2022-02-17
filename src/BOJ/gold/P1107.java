package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1107 {

    static boolean[] broken = new boolean[10];

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());

        if(m > 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int i=0; i<m; i++) {
                int b = Integer.parseInt(st.nextToken());
                broken[b] = true;
            }
        }

        int min = Math.abs(n - 100);
        for(int i=0; i<1000001; i++) {
            int len = check(i);
            if(len > 0) {
                int press = Math.abs(n - i);
                min = Math.min(min, press + len);
            }
        }

        System.out.println(min);

    }

    static int check(int n) {
        if(n == 0) {
            if(broken[0])
                return 0;
            else
                return 1;
        }

        int len = 0;
        while(n > 0) {
            if(broken[n%10])
                return 0;
            n /= 10;
            len++;
        }
        return len;
    }

}
