package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1476 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int e=1,s=1,m=1;
        int ans = 1;

        while(true) {
            if(e==a && s==b && m==c)
                break;
            e++; s++; m++;
            if(e==16) e=1;
            if(s==29) s=1;
            if(m==20) m=1;
            ans++;
        }
        System.out.println(ans);
    }
}
