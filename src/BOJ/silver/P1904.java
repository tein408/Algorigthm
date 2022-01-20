package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1904 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        if(n < 2) {
            System.out.println(n);
            return;
        }

        int[] tile = new int[n+1];
        tile[0] = 1;
        tile[1] = 1;
        for(int i=2; i<=n; i++) {
            tile[i] = (tile[i-1] + tile[i-2]) % 15746;
        }

        System.out.println(tile[n]);
    }
}
