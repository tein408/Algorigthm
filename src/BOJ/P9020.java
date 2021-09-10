package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9020 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        boolean[] prime = new boolean[10000];
        prime[0] = true;
        prime[1] = true;

        for(int i=2; i<10000; i++) {
            if(!prime[i]) {
                for(int j=i+i; j<10000; j+=i) prime[j] = true;
            }
        }

        for(int k=0; k<num; k++) {
            int n = Integer.parseInt(bf.readLine());
            for(int j=n/2;;j--) {
                if (!prime[j] && !prime[n-j]) {
                    System.out.println(j + " " + (n - j));
                    break;
                }
            }
        }
    }

}
