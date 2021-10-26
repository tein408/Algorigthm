package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1260 {

    static int[][] arr;
    static boolean[] dfsVisit;
    static boolean[] bfsVisit;
    static int n,m,v;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        arr = new int[n+1][n+1];
        dfsVisit = new boolean[n+1];
        bfsVisit = new boolean[n+1];

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(bf.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        dfs(v);
        sb.append("\n");
        bfs(v);

        System.out.println(sb);

    }

    static void dfs(int a) {
        dfsVisit[a] = true;
        sb.append(a).append(" ");

        for(int i=1; i<n+1; i++) {
            if(!dfsVisit[i] && arr[a][i] == 1) {
                dfs(i);
            }
        }
    }

    static void bfs(int a) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(a);
        bfsVisit[a] = true;

        while(!queue.isEmpty()) {
            int poll = queue.poll();
            sb.append(poll).append(" ");

            for(int i=1; i<n+1; i++) {
                if(!bfsVisit[i] && arr[poll][i] == 1) {
                    queue.add(i);
                    bfsVisit[i] = true;
                }
            }

        }
    }

}
