package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10707 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());
        int p = Integer.parseInt(bf.readLine());

        int x = a*p;
        int y = c>=p? b : b+d*(p-c);
        System.out.println(Math.min(x,y));
    }
}
