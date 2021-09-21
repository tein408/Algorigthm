package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1003 {

    //초기 배열 원소값 모두 0으로 생성
    static int[] result = new int[41];

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bf.readLine());

        //피보나치 0~2 값 저장
        result[0] = 0;
        result[1] = 1;
        result[2] = 1;
        
        /*            0   1
        * f(0) = 0    1   0
        * f(1) = 1    0   1
        * f(2) = 1    1   1 => f(0) f(1) 
        * f(3) = 2    1   2 => f(2) f(3)
        * f(4) = 3    2   3 => f(3) f(4)
        * f(5) = 5    3   5 => f(4) f(5)
        * */

        for(int i=0; i<t; i++) {
            int temp = Integer.parseInt(bf.readLine());

            if(temp==0)
                System.out.println("1 0");
            else if(temp==1)
                System.out.println("0 1");
            else {
                fibonacci(temp);
                System.out.println(result[temp-1] + " " + result[temp]);
            }
        }

    }

    static int fibonacci(int n) {
        if(n==0) {
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        else {
            if(result[n] != 0) {
                //피보나치값이 저장되어 있으면 그 값을 리턴
                return result[n];
            } else {
                //피보나치값을 배열에 저장하여 리턴
                result[n] = fibonacci(n-1) + fibonacci(n-2);
                return result[n];
            }
        }
    }

}
