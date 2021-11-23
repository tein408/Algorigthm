package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class P10827 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        BigDecimal a = new BigDecimal(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a.pow(b).toPlainString());

    }
}
