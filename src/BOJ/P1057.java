package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1057 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int kim = Integer.parseInt(st.nextToken());
        int lim = Integer.parseInt(st.nextToken());

        int cnt = 1;

        while(true) {

            if(kim > lim) {
                int temp = kim;
                kim = lim;
                lim = temp;
            }

            int cha = lim - kim;

            if(cha == 1) {
                if(lim%2 == 0)
                    break;
            }

            if(kim%2 == 0) {
                kim /= 2;
            } else {
                kim = kim/2 + 1;
            }

            if(lim%2 == 0) {
                lim /= 2;
            } else {
                lim = lim/2 + 1;
            }

            cnt++;



        }

        System.out.println(cnt);

    }


}
