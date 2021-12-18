package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P5800 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int k = Integer.parseInt(bf.readLine());

        for(int j=1; j<=k; j++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());
            int[] student = new int[n];

            for(int i=0; i<n; i++) {
                student[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(student);

            int gapMax = Integer.MIN_VALUE;
            for(int i=n-1; i>0; i--) {
                int temp = student[i] - student[i-1];
                gapMax = Math.max(temp, gapMax);
            }

            int max = student[n-1];
            int min = student[0];

            sb.append("Class ").append(j).append("\n");
            sb.append("Max ").append(max).append(", ");
            sb.append("Min ").append(min).append(", ");
            sb.append("Largest gap ").append(gapMax).append("\n");
        }

        System.out.println(sb);
    }
}
