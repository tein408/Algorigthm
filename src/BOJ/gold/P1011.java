package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1011 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(bf.readLine());

        while(t-- > 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            double x = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());

            double distance = y - x;
            double max = Math.round(Math.sqrt(distance));

            int result;

            if(distance > Math.pow(max, 2)) {
                result = (int) max * 2;
            } else {
                result = (int) max * 2 - 1;
            }

            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
