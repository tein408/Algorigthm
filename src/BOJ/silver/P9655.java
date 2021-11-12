package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9655 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        System.out.println(n%2==0 ? "CY" : "SK");
    }
}
