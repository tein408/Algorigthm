package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1024 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        StringTokenizer st = new StringTokenizer(bf.readLine());

        long n = Long.parseLong(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean chk = true;

        while(m < 101) {
            long start = n/m - (m-1) / 2;

            if(start < 0)
                break;

            long goal = (start*2 + m-1)*m  / 2;
            if(n == goal) {
                for(long i=0; i<m; i++) {
                    sb.append(start+i).append(" ");
                }

                chk = false;
                break;
            }

            m++;
        }

        if(chk)
            sb.append("-1");

        System.out.println(sb);
    }
}
