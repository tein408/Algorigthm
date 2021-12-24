package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1120 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        String a = st.nextToken();
        String b = st.nextToken();

        int max = 0;

        int n = b.length() - a.length() + 1;

        for(int i=0; i<n; i++) {
            String temp = b.substring(i, i + a.length());
            int cnt = 0;
            for(int j=0; j<temp.length(); j++) {
                if(a.charAt(j) == temp.charAt(j))
                    cnt++;
            }
            max = Math.max(max, cnt);
        }

        System.out.println(a.length() - max);

    }
}
