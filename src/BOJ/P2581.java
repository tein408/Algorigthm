package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2581 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(bf.readLine());
        int num2 = Integer.parseInt(bf.readLine());
        int hap=0;
        int min=0;
        for(int i = num1; i<=num2; i++){
            if(isPrime(i) == 1){
                hap += i;
                if(min == 0) min = i;
            }
        }

        if(hap!=0) System.out.println(hap+"\n"+min);
        else System.out.println(-1);

    }

    static int isPrime(int n){
        int i = 0;
        int last = n / 2;
        if (n <= 1) return 0;
        for (i = 2; i <= last; i++) {
            if ((n%i) == 0)  return 0;
        }
        return 1;
    }


}
