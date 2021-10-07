package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9095 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bf.readLine());
        
        //규칙을 찾는 문제
        
        int[] result = new int[11];
        result[0] = 0;
        result[1] = 1;
        result[2] = 2;
        result[3] = 4;

        for(int i=0; i<t; i++) {

            int n = Integer.parseInt(bf.readLine());

            for(int j=4; j<=n; j++) {
                result[j] = result[j-1] + result[j-2] + result[j-3];
            }
            System.out.println(result[n]);
        }

    }


}
