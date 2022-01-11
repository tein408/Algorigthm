package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5347 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(bf.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            long res = ((long) a * b) / gcd(a, b);
            sb.append(res).append("\n");
        }

        System.out.println(sb);
    }

    static int gcd(int a, int b) {
        if(a % b == 0)
            return b;
        return gcd(b, a % b);
    }

}
