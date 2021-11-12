package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3004 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int x = n/2+1;
        int y = n-x+2;
        System.out.println(x*y);
    }
}
