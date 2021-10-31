package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5554 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());

        int min = (a + b + c + d) / 60;
        int sec = (a + b + c + d) % 60;

        System.out.println(min);
        System.out.println(sec);

    }
}
