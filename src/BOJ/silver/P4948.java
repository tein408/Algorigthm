package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4948 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n, cnt, b;

        while(true) {
            n = Integer.parseInt(bf.readLine());
            cnt = 0;
            b = 2*n;
            if(n==0) break;
            boolean[] isPrime = new boolean[2468913];
            for(int i=2; i<=b; i++) {
                if(isPrime[i]) continue;
                if(i > n) cnt++;
                for(int j=i+i; j<=b; j+=i) isPrime[j] = true;
            }
            System.out.println(cnt);
        }


    }
}
