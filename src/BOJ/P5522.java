package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5522 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for(int i=0; i<5; i++) {
            sum += Integer.parseInt(bf.readLine());
        }
        System.out.println(sum);

    }
}
