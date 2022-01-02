package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4375 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str = bf.readLine()) != null) {
            int n = Integer.parseInt(str);
            int cnt = 1;
            int temp = 1;

            while(true) {
                if(temp % n == 0) {
                    break;
                }
                temp = temp * 10 + 1;
                temp %= n;
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
