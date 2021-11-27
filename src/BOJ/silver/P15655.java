package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P15655 {
    static int n, m;
    static int[] arr;
    static int[] ans;
    static boolean[] visit;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        ans = new int[n];
        visit = new boolean[n];

        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        solv(0, 0);
        System.out.println(sb);
    }

    static void solv(int idx, int a) {
        if(idx == m) {
            for(int i=0; i<m; i++) {
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=a; i<n; i++) {
            if(!visit[i]) {
                visit[i] = true;
                ans[idx] = arr[i];
                solv(idx + 1, i + 1);
                visit[i] = false;
            }
        }
    }

}
