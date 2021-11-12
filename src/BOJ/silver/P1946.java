package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P1946 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(bf.readLine());

        while(t-- > 0) {
            int n = Integer.parseInt(bf.readLine());
            int[] arr = new int[n+1];

            for(int i=0; i<n; i++) {
                st = new StringTokenizer(bf.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                arr[a] = Integer.parseInt(st.nextToken());
            }

            int rank = arr[1];
            int ans = 1;

            for(int i=2; i<=n; i++) {
                if(rank > arr[i]){
                    rank = arr[i];
                    ans++;
                }
            }
            sb.append(ans);
            sb.append("\n");
        }
        System.out.println(sb);

    }
}