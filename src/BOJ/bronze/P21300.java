package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P21300 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        System.out.println(a*5+b*5+c*5+d*5+e*5+f*5);

    }
}