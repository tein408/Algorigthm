package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P9663 {

    static int n, cnt = 0;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        arr = new int[n];

        solv(0);

        System.out.println(cnt);
    }

    static void solv(int idx) {
        //idx==n이면 n행 까지 퀸 설치 했으므로 cnt++;
        if(idx == n) {
            cnt++;
        }
        else {
            for(int i=0; i<n; i++) {
                arr[idx] = i;
                //해당 열(idx)에서 행(i)에 퀸 설치 가능 여부 확인
                //가능하면 다음 열 호출
                if(isPossible(idx)) {
                    solv(idx+1);
                }
            }
        }
    }

    static boolean isPossible(int idx) {
        for(int i=0; i<idx; i++) {
            //열==행 확인
            if(arr[idx] == arr[i])
                return false;
            //대각선 확인
            else if(Math.abs(idx - i) == Math.abs(arr[idx] - arr[i]))
                return false;
        }
        return true;
    }

}
