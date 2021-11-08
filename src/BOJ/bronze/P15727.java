package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P15727 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        System.out.println(n%5 == 0? n/5 : n/5+1);
    }
}
