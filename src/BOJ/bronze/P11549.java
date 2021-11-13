package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11549 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int cnt = 0;
        for(int i=0; i<5; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(temp == t)
                cnt++;
        }

        System.out.println(cnt);

    }
}
