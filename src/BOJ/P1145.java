package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1145 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int[] arr = new int[5];

        for(int i=0; i<5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int re = 1;
        while(true) {
            int cnt = 0;
            for(int i=0; i<5; i++) {
                if(re >= arr[i] && re % arr[i] == 0)
                    cnt++;
            }
            if(cnt >=3) {
                System.out.println(re);
                return;
            }
            re++;
        }


    }

}
