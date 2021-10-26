package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11724 {

    static int n, m;
    static int[][] arr;
    static boolean[] visit;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n+1][n+1];
        visit = new boolean[n+1];

        int cnt = 0;

        //인접 행렬 입력
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        //방문하지 않은 정점이 있다면 탐색 후 연결 요소++
        for(int i=1; i<=n; i++) {
            if(!visit[i]) {
                dfs(i);
                cnt++;
            }
        }

        System.out.println(cnt);

    }

    static void dfs(int a) {
        //방문 체크
        visit[a] = true;

        //연결되어 있으면서
        //방문 하지 않은 경우 탐색
        for(int i=1; i<=n; i++) {
            if(!visit[i] && arr[a][i] == 1) {
                dfs(i);
            }
        }
    }

}
