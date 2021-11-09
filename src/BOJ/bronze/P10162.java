package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P10162 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[3];

        if(n%10 != 0) {
            System.out.println(-1);
            return;
        }

        arr[0] = n/300;
        arr[1] = n%300 / 60;
        arr[2] = n%300%60 / 10;

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

    }
}
