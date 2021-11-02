package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1205 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int[] rank = new int[n];

        int ans = 1;

        if(n > 0) {
            st = new StringTokenizer(bf.readLine(), " ");
            for(int i=0; i<n; i++) {
                rank[i] = Integer.parseInt(st.nextToken());
            }
        }

        if(n==p && rank[n-1] >= t)
            ans = -1;
        else {
            for(int i=0; i<n; i++) {
                if(rank[i] > t)
                    ans++;
                else
                    break;
            }
        }

        System.out.println(ans);

    }
}
