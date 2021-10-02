package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1300 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int k = Integer.parseInt(bf.readLine());

        int left = 1;
        int right = k;
        int mid;

        //n=6, k=26일 때
        //각 행에서 26보다 작은 수의 개수(cnt)는
        //1 2 3 4 5 6 -> 6
        //2 4 6 8 10 12 -> 6
        //3 6 9 12 15 18 -> 6
        //4 8 12 16 20 24 -> 6
        //5 10 15 20 25 30 -> 5
        //6 12 18 24 26 30 -> 4
        //=> min(k/i, n) 이 각 행에서 k보다 작은 수의 개수(cnt)가 됨.
        //   B[k]는 cnt를 이용해서 찾음

        while(left < right) {
            int cnt = 0;
            mid = (left + right) / 2;

            //인덱스가 1부터 시작이므로 i=1부터 시작
            for(int i=1; i<=n; i++)
                cnt += Math.min(mid/i, n);

            if(cnt < k)
                left = mid+1;
            else
                right = mid;

        }

        System.out.println(right);

    }
}
