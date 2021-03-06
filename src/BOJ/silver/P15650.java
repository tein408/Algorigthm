package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class P15650 {

    static int n, m;
    static int[] arr;
    static boolean[] visit;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visit = new boolean[n+1];

        solv(0, 1);
        System.out.println(sb);
    }

    static void solv(int cnt, int a) {
        if(cnt == m) {
            for(int i=0; i<m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=a; i<=n; i++) {
            if(!visit[i]) {
                visit[i] = true;
                arr[cnt] = i;
                solv(cnt + 1, i+1);
                visit[i] = false;
            }
        }
    }

}
