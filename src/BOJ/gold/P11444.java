package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P11444 {

    static long mod = 1000000007;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bf.readLine());

        if(n == 0) {
            System.out.println(0);
            return;
        }
        if(n < 3) {
            System.out.println(1);
            return;
        }

        long[][] arr = {{1, 1}, {1, 0}};
        long[][] ans = {{1, 0}, {0, 1}};

        while(n > 0) {
            if(n%2 == 1)
                solv(ans, arr);
            n /= 2;
            solv(arr, arr);
        }

        System.out.println(ans[1][0]);
    }

    static void solv(long[][] arr1, long[][] arr2) {
        long[][] temp = new long[2][2];

        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                for(int k=0; k<2; k++) {
                    temp[i][j] += (arr1[i][k] * arr2[k][j]);
                }
                temp[i][j] %= mod;
            }
        }

        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                arr1[i][j] = temp[i][j];
            }
        }
    }

}
