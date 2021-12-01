package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P13305 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        long[] meter = new long[n];
        long[] money = new long[n+1];

        for(int i=0; i<n-1; i++) {
            meter[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<n; i++) {
            money[i] = Long.parseLong(st.nextToken());
        }

        long total = 0;
        long min = money[0];

        for(int i=0; i<n-1; i++) {
            if(money[i] < min)
                min = money[i];
            total += meter[i] * min;
        }

        System.out.println(total);

    }
}
