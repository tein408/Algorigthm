package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1924 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        String[] res = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};

        int d = 0;

        for(int i=0; i<x-1; i++) {
            d += arr[i];
        }
        d += y;

        int week = d % 7;

        System.out.println(res[week]);

    }
}
