package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1463 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n+1];

        arr[1] = 0;

        for(int i=2; i<=n; i++) {
            //1빼고 시작
            //아래 if문 통해 /2와 /3의 값과 비교하여 작은 값을 선택함.
            //3가지 방법 모두 시도하기 위해 if만 사용
            arr[i] = arr[i-1] + 1;
            if(i%2 == 0)
                arr[i] = Math.min(arr[i], arr[i/2] + 1);
            if(i%3 == 0)
                arr[i] = Math.min(arr[i], arr[i/3] + 1);
        }

        System.out.println(arr[n]);

    }
}
