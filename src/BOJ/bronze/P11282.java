package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11282 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        System.out.println((char) (a+44031));
    }
}
