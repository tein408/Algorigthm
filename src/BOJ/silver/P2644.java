package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2644 {

    static int n;
    static int[][] arr;
    static int[] cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(bf.readLine());

        arr = new int[n+1][n+1];
        cnt = new int[n+1];

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            arr[c][d] = arr[d][c] = 1;
        }

        bfs(a, b);
        System.out.println(cnt[b] == 0 ? -1 : cnt[b]);

    }

    static void bfs(int x, int y) {
        Queue<Integer> que = new LinkedList<>();
        que.add(x);

        while(!que.isEmpty()) {
            int curr = que.poll();
            if(curr == y)
                return;

            for(int j=1; j<=n; j++) {
                if(arr[curr][j] == 1 && cnt[j] == 0) {
                    cnt[j] = cnt[curr] + 1;
                    que.add(j);
                }
            }
        }
    }
}
