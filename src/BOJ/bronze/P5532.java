package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5532 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(bf.readLine());
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());

        int ac = a%c==0? a/c : a/c+1;
        int bd = b%d==0? b/d : b/d+1;
        int max = Math.max(ac, bd);
        System.out.println(l-max);
    }
}
