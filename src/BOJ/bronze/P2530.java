package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2530 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(bf.readLine());

        c += n%60;
        b += n/60;

        if(c >= 60) {
            b += c/60;
            c%= 60;
        }
        if(b >= 60) {
            a += b / 60;
            b %= 60;
        }
        if (a >= 24)
            a %= 24;

        System.out.println(a+" "+b+" "+c);

    }
}
