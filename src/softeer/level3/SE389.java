package softeer.level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SE389 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] student = new int[n];

        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<n; i++) {
            student[i] = Integer.parseInt(st.nextToken());
        }

        while(k-- > 0) {
            st = new StringTokenizer(bf.readLine(), " ");
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken());

            double sum = 0;
            double m = end - start + 1;

            for(int i=start; i<end; i++) {
                sum += student[i];
            }

            double avg = sum / m;

            System.out.printf("%.2f\n", avg);
        }

    }
}
