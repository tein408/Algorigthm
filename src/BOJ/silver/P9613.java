package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9613 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int t = Integer.parseInt(bf.readLine());

        while(t-- > 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long ans = 0;
            for(int i=0; i<n-1; i++) {
                for(int j=i+1; j<n; j++) {
                    ans += gcd(arr[i], arr[j]);
                }
            }

            sb.append(ans).append("\n");
        }

        System.out.println(sb);
    }

    static int gcd(int x, int y) {
        if(x == 0)
            return y;
        return gcd(y%x, x);
    }
}
