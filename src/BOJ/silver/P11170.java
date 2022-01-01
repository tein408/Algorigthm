package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11170 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(bf.readLine());

        while(t-- > 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            int cnt = 0;

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            for(int i=n; i<=m; i++) {
                String temp = String.valueOf(i);
                for(char c : temp.toCharArray())
                    if(c == '0')
                        cnt++;
            }
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}
