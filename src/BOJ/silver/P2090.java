package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2090 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        long[] arr = new long[n];
        long multi = 1, sum = 0;

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            multi *= arr[i];
        }

        for(int i=0; i<n; i++) {
            sum += (multi / arr[i]);
        }

        long gcd = gcd(sum, multi);
        long a = sum / gcd;
        long b = multi / gcd;

        System.out.println(b + "/" + a);

    }

    static long gcd(long x, long y) {
        if(y == 0)
            return x;
        return gcd(y, x%y);
    }

}
