package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P20492 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int a = (int) (n - n*0.22);
        int b = (int) (n - (n - n*0.8)*0.22);
        System.out.println(a +" "+b);
    }
}
