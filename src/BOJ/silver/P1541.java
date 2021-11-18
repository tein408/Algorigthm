package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1541 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer minus = new StringTokenizer(bf.readLine(), "-");

        int sum = 0;
        int idx = 0;
        while(minus.hasMoreTokens()) {
            int temp = 0;
            StringTokenizer plus = new StringTokenizer(minus.nextToken(), "+");

            while(plus.hasMoreTokens()) {
                temp = Integer.parseInt(plus.nextToken());
                if(idx == 0)
                    sum += temp;
                else
                    sum -= temp;
            }
            idx++;
        }
        System.out.println(sum);

    }
}
