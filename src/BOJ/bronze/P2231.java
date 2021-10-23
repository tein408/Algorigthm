package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2231 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String num = bf.readLine();
        int n = Integer.parseInt(num);
        int answer = 0;

        for(int i=0; i<n; i++) {
            int sum = 0;
            int temp = i;
            while(temp!=0) {
                sum += temp%10;
                temp/=10;
            }

            if(sum + i == n) {
                answer = i;
                break;
            }

        }

        System.out.println(answer);

    }
}
