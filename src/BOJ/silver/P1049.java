package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P1049 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int minSix = Integer.MAX_VALUE;
        int minOne = Integer.MAX_VALUE;

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            minSix = Math.min(a, minSix);
            minOne = Math.min(b, minOne);
        }

        //팩으로만 구매 vs 낱개로만 구매
        int cost = Math.min((n/6+1) * minSix, n * minOne);
        //위에서 구한 cost vs 팩으로 구매 후 잔량 낱개로 구매
        cost = Math.min(cost, n/6 * minSix + n%6 * minOne);

        System.out.println(cost);
    }
}
