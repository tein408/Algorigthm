package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4796 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int cnt = 1;

        while(true) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            if(l==0 && p==0 && v==0)
                break;

            int ans = (v/p * l) + Math.min(v%p, l);

            sb.append("Case ").append(cnt).append(": ");
            sb.append(ans).append("\n");

            cnt++;

        }
        System.out.println(sb);

    }
}
