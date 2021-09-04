package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2839 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        // x : 5kg 나눈 몫 , y : 3kg 나눈 몫
        int x = 0;
        int y = 0;
        // n5 : 5kg 뺀 나머지 , n3 : 3kg 뺀 나머지
        int n5 = 0;
        int n3 = 0;

        x = num/5;

        while(x>=0){
            n5 = num - 5*x;
            y = n5/3;
            n3 = n5 - 3*y;
            if(n3>0) {
                x -= 1;
                if(x<0) break;
            } else if(n3 == 0) break;
        }

        if(n3 == 0 && x >= 0) System.out.println(x+y);
        else System.out.println(-1);


    }
}
