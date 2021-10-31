package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P2960 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        boolean[] prime = new boolean[n+1];
        int cnt = 0;

        for(int i=2; i<=n; i++) {
            prime[i] = true;
        }

        for(int i=2; i<=n; i++) {
            for(int j=i; j<=n; j+=i) {
                if(!prime[j])   //이미 지워진 수면 통과
                    continue;
                prime[j] = false;   //하나씩 지움
                cnt++;      
                if(cnt == k) {  //목표로한 k번째가 되면 cnt 출력하고 종료
                    System.out.println(j);
                    return;
                }
            }
        }

    }

}
