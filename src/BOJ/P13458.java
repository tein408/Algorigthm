package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13458 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(bf.readLine(), " ");
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        long total = 0;

        for(int i=0; i<n; i++) {
            //총감독관이 감시 가능한 인원 제외
            arr[i] = arr[i] - b;
            total++;

            //부관독관이 감시 가능한 인원 나누기
            if(arr[i] > 0) {
                //몫을 먼저 더하고
                total += arr[i] / c;
                //나머지가 있다면 더하기
                if(arr[i] % c > 0)
                    total++;
            }
        }
        System.out.println(total);

    }
}
