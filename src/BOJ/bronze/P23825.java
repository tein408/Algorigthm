package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P23825 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int s = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        int min = Math.min(s, a);

        if(min / 2 > 0) {
            System.out.println(min/2);
        }

    }
}
