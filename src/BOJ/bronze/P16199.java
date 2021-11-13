package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16199 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int y, m, d;
        y = - Integer.parseInt(st.nextToken());
        m = - Integer.parseInt(st.nextToken());
        d = - Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        y += Integer.parseInt(st.nextToken());
        m += Integer.parseInt(st.nextToken());
        d += Integer.parseInt(st.nextToken());

        if(m > 0)
            System.out.println(y);
        else if(m < 0)
            System.out.println(y - 1);
        else {
            if(d >= 0)
                System.out.println(y);
            else
                System.out.println(y-1);
        }

        System.out.println(y+1);
        System.out.println(y);

    }
}
