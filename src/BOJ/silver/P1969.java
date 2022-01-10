package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1969 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int res = 0;

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n];

        for(int i=0; i<n; i++) {
            arr[i] = bf.readLine();
        }

        for(int i=0; i<m; i++) {
            int[] cnt = new int[4];

            for(int j=0; j<n; j++) {
                char c = arr[j].charAt(i);
                if(c == 'A')
                    cnt[0]++;
                else if(c == 'C')
                    cnt[1]++;
                else if(c == 'G')
                    cnt[2]++;
                else if(c == 'T')
                    cnt[3]++;
            }

            int idx = 0;
            int max = -1;
            for(int j=0; j<4; j++) {
                if(max < cnt[j]) {
                    max = cnt[j];
                    idx = j;
                }
            }

            if(idx == 0)
                sb.append("A");
            else if(idx == 1)
                sb.append("C");
            else if(idx == 2)
                sb.append("G");
            else if(idx == 3)
                sb.append("T");

            res += (n - max);

        }

        sb.append("\n").append(res);
        System.out.println(sb);

    }
}
