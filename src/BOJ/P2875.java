package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2875 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        //n2 m1 k
        //6 3 2
        int team = 0;
        while( (n+m-k)>=3 && n>=2 && m>=1){
            n -= 2;
            m -= 1;
            team++;
        }
        System.out.println(team);



    }
}
