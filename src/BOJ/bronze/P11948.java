package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11948 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[4];
        a[0] = Integer.parseInt(bf.readLine());
        a[1] = Integer.parseInt(bf.readLine());
        a[2] = Integer.parseInt(bf.readLine());
        a[3] = Integer.parseInt(bf.readLine());

        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        Arrays.sort(a);

        int sum = a[1] + a[2] + a[3] + Math.max(b,c);
        System.out.println(sum);

    }
}
