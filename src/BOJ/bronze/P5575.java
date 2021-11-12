package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5575 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i=0; i<3; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int sh = Integer.parseInt(st.nextToken());
            int sm = Integer.parseInt(st.nextToken());
            int ss = Integer.parseInt(st.nextToken());
            int eh = Integer.parseInt(st.nextToken());
            int em = Integer.parseInt(st.nextToken());
            int es = Integer.parseInt(st.nextToken());

            int h,m,s;

            if(es>=ss) {
                s = es - ss;
            } else {
                em--;
                s = 60 + es - ss;
            }

            if(em >= sm) {
                m = em - sm;
            } else {
                eh--;
                m = 60 + em - sm;
            }

            h = eh - sh;
            System.out.println(h+" "+m+" "+s);

        }

    }
}
