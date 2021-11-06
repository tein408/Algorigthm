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

        StringBuffer sb = new StringBuffer(a);
        int c = Integer.parseInt(sb.reverse().toString());

        sb = new StringBuffer(b);
        int d = Integer.parseInt(sb.reverse().toString());

        String res = (c+d) + "";
        sb = new StringBuffer(res);
        System.out.println(Integer.parseInt(sb.reverse().toString()));

    }
}
