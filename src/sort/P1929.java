package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1929 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        //배열 생성
        boolean[] isPrime = new boolean[b+1];

        for(int i=2; i<=b; i++) {
            //짝수면 소수가 아니므로 통과
            if(isPrime[i]) continue;

            //짝수가 아닌 i가 a보다 크면 출력
            if(i >= a) System.out.println(i);

            //이미 지워진 숫자가 아니라면 그 배수부터 출발, 가능한 모든 숫자 지우기
            for(int j=i+i; j<=b; j+=i) isPrime[j] = true;
        }
    }
}
