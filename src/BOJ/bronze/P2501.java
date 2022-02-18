package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2501 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i=1; i<=n; i++) {
            if(n%i == 0)
                m--;
            if(m == 0) {
                System.out.println(i);
                break;
            }
        }

        if(m != 0)
            System.out.println(0);
    }

}
