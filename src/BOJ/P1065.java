package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1065 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int cnt = 99;

        //1~99 : 한수
        //1000까지만 입력 -> 자릿수는 최대 3자리
        //1000은 한수가 아님.
        //백의자리 - 십의자리 , 십의자리 - 일의자리 비교하여 한수 판별
        //위 두 수의 차가 같으면 한수

        if(num < 100) {
            System.out.println(num);
        } else {
            if(num == 1000) num = 999;
            for(int i=100; i<=num; i++) {
                int hun = i/100;
                int ten = (i/10) % 10;      //ex) 987/10 = 98 //98%10 = 8
                int one = i%10;
                if((hun-ten) == (ten-one)) cnt++;
            }
            System.out.println(cnt);
        }

    }

}
