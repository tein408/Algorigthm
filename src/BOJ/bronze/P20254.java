package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P20254 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int ur = Integer.parseInt(st.nextToken());
        int tr = Integer.parseInt(st.nextToken());
        int uo = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());
        System.out.println(56*ur + 24*tr + 14*uo + 6*to);
    }
}
