package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11005 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while(n > 0) {
            long temp = n % b;
            if(temp < 10) {
                sb.append((char)(temp + '0'));
            } else {
                sb.append((char)(temp - 10 + 'A'));
            }
            n /= b;
        }

        System.out.println(sb.reverse());
    }
}
