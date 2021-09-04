package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1978 {
    public static void main(String[] args) throws Exception{
        // 소수찾기
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int[] arr = new int[num];
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        for(int i=0; i<num; i++) {
            arr[i] = isPrime(Integer.parseInt(st.nextToken()));
            if((arr[i]) == 1) cnt++;
        }

        System.out.println(cnt);

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
