package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11652 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        long[] card = new long[n];
        for(int i=0; i<n; i++) {
            card[i] = Long.parseLong(bf.readLine());
        }

        Arrays.sort(card);

        int cnt = 1, max = 1, idx = 0;
        for(int i=1; i<n; i++) {
            if(card[i] == card[i-1])
                cnt++;
            else
                cnt = 1;

            if(cnt > max) {
                max = cnt;
                idx = i;
            }
        }

        System.out.println(card[idx]);
    }
}
