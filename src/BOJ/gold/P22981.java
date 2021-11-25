package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P22981 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");;

        int n = Integer.parseInt(st.nextToken());
        Long k = Long.parseLong(st.nextToken());

        st = new StringTokenizer(bf.readLine(), " ");

        long[] v = new long[n];
        
        for(int i=0; i<n; i++) {
            v[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(v);

        long a = 0, b = 0;
        long max = Long.MIN_VALUE;
        long sum = 0;

        for(int i=0; i<n-1; i++) {
            a += v[0];
            b = v[i+1] * (n - i - 1);
            sum = a + b;
            max = Math.max(max, sum);
        }

        if(k%max == 0)
            System.out.println(k/max);
        else
            System.out.println(k/max + 1);

    }
}
