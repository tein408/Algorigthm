package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P17427 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        long sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i * (n/i);
        }

        System.out.println(sum);

    }

}
