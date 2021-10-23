package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P15633 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int result = 0;

        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                result += i;
            }
        }

        System.out.println(result * 5 - 24);


    }
}
