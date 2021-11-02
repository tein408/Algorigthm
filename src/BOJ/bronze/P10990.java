package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P10990 {
    static String star = "*";
    static String blank = " ";
    static String enter = "\n";

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(bf.readLine());

        for(int i=0; i<n; i++) {
            for(int j=n-i-1; j>0; j--) {
                sb.append(blank);
            }
            for(int j=i; j>=0; j--) {
                if(j==i || j==n)
                    sb.append(star);
                else
                    sb.append(blank);
            }
            for(int j=1; j<=i; j++) {
                if(j==i)
                    sb.append(star);
                else
                    sb.append(blank);
            }
            sb.append(enter);
        }

        System.out.println(sb);

    }
}
