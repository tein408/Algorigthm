package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1475 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        int cnt = 0;
        int[] arr = new int[10];

        for(int i=0; i<str.length(); i++) {
            int idx = str.charAt(i) - '0';
            //6, 9 호환가능 == 하나로 모으기
            if(idx == 9)
                idx = 6;
            arr[idx]++;
        }

        arr[6] = arr[6]/2 + arr[6]%2;

        Arrays.sort(arr);

        cnt = arr[9];

        System.out.println(cnt);

    }
}
