package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2576 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0, min = Integer.MAX_VALUE;

        for(int i=0; i<7; i++) {
            int curr = Integer.parseInt(bf.readLine());
            if(curr %2 == 1) {
                sum += curr;
                min = Math.min(min, curr);
            }
        }

        if(sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}
