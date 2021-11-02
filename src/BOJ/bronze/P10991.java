package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10991 {
    static String star = "* ";
    static String blank = " ";
    static String enter = "\n";

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(bf.readLine());

        for(int i=1; i<=n; i++) {
            for(int j=i; j<n; j++) {
                sb.append(blank);
            }
            for(int j=0; j<i; j++) {
                sb.append(star);
            }
            sb.append(enter);
        }

        System.out.print(sb);

    }
}
