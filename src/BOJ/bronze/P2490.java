package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2490 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = 3;
        while(n-- > 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            int cnt = 0;
            for(int i=0; i<4; i++)
                cnt += Integer.parseInt(st.nextToken());

            if(cnt == 0)
                sb.append("D").append("\n");
            else if(cnt == 1)
                sb.append("C").append("\n");
            else if(cnt == 2)
                sb.append("B").append("\n");
            else if(cnt == 3)
                sb.append("A").append("\n");
            else
                sb.append("E").append("\n");

        }

        System.out.println(sb);
    }
}
