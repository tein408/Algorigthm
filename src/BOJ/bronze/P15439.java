package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P15439 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        System.out.println(n * (n-1));

    }
}
