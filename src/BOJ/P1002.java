package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1002 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        StringTokenizer st;

        while(t-- > 0) {
            st = new StringTokenizer(bf.readLine(), " ");

            double x1 = Double.parseDouble(st.nextToken());
            double y1 = Double.parseDouble(st.nextToken());
            double r1 = Double.parseDouble(st.nextToken());
            double x2 = Double.parseDouble(st.nextToken());
            double y2 = Double.parseDouble(st.nextToken());
            double r2 = Double.parseDouble(st.nextToken());

            double dis = Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
            double diff = r1 > r2 ? r1-r2 : r2-r1;

            if(dis == 0 && r1 == r2)                // 원이 겹치는 경우
                System.out.println(-1);
            else if(dis < r1+r2 && diff < dis)      // 교점이 2개인 경우
                System.out.println(2);
            else if(dis == r1+r2 || dis == diff)    // 외접하는 경우 (교점 1개)
                System.out.println(1);
            else                                    // 겹치지 않는 경우
                System.out.println(0);

        }

    }
}
