package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2292 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int count = 1;
        int range = 2;

        if(num == 1) System.out.println(1);
        else {
            while(range <= num) {
                range = range + 6*count;
                count++;
            }
            System.out.println(count);
        }
    }
}
