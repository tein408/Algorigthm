package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1735 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[2][2];

        for(int i=0; i<2; i++) {
            String temp = bf.readLine();
            for(int j=0; j<2; j++) {
                arr[i][j] = Integer.parseInt(temp.split(" ")[j]);
            }
        }

        int a = arr[0][0] * arr[1][1] + arr[1][0] * arr[0][1];
        int b = arr[0][1] * arr[1][1];

        int result = getGCD(a,b);
        System.out.println(a/result + " " + b/result);

    }

    static int getGCD(int a, int b) {
        if(a%b == 0)
            return b;
        else
            return getGCD(b, a%b);
    }
}
