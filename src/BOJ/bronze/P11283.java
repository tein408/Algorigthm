package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11283 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int c = bf.readLine().charAt(0) - '가' + 1;

        System.out.println(c);

    }
}
