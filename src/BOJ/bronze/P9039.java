package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9039 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(bf.readLine());
        while(t-- > 0) {
            String str = bf.readLine();

            StringTokenizer st = new StringTokenizer(str, " ");

            while(st.hasMoreTokens()) {
                String temp = st.nextToken();
                for(int i=temp.length()-1; i>=0; i--)
                    sb.append(temp.charAt(i));
                sb.append(" ");
            }
            sb.append("\n");

        }
        System.out.println(sb);
    }
}
