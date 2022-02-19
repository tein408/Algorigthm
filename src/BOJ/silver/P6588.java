package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6588 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] prime = new boolean[1000001];

        for(int i=2; i<1000001; i++)
            prime[i] = true;

        for(int i=2; i<1000001; i++) {
            if(!prime[i])
                continue;

            for(int j=2*i; j<1000001; j+=i) {
                prime[j] = false;
            }
        }

        while(true) {
            int n = Integer.parseInt(bf.readLine());
            boolean chk = false;

            if(n == 0) {
                break;
            }

            for(int i=2; i<=n/2; i++) {
                if(prime[i] && prime[n-i]) {
                    sb.append(n).append(" = ").append(i).append(" + ").append(n-i).append("\n");
                    chk = true;
                    break;
                }
            }

            if(!chk)
                sb.append("Goldbach's conjecture is wrong.").append("\n");
        }

        System.out.println(sb);
    }

}
