package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1977 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        String a = st.nextToken();
        String b = st.nextToken();
        String c = "", d = "";

        for(int i=a.length()-1; i>=0; i--) {
            c += a.charAt(i);
        }
        for(int i=b.length()-1; i>=0; i--) {
            d += b.charAt(i);
        }

        String ans = (Integer.parseInt(c) + Integer.parseInt(d)) + "";

        String res = "";
        for(int i=ans.length()-1; i>=0; i--) {
             res += ans.charAt(i);
        }

        System.out.println(Integer.parseInt(res));

    }
}
