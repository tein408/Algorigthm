package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1292 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int[] arr = new int[1001];

        //i : 배열에 입력될 숫자
        //j : i 만큼 반복해서 입력하도록
        //cnt : 배열의 인덱스 지정
        for(int i=1; i<1001; i++) {
            for(int j=0; j<i; j++) {
                if(cnt > 1000) break;
                arr[cnt] = i;
                cnt++;
            }
        }

        int sum = 0;
        for(int i=a-1; i<b; i++) {
            sum += arr[i];
        }

        System.out.println(sum);


    }
}
