package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2606 {

    static boolean[] visit; //방문 여부
    static int[][] arr; //그래프
    static int cnt; 
    static int n, m;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bf.readLine());    //정점
        m = Integer.parseInt(bf.readLine());    //간선

        visit = new boolean[n + 1];

        //인덱스가 각각의 노드 번호가 될 수 있도록
        //0번 인덱스는 아무것도 없는 상태
        //-> n+1 하여 배열 길이 지정
        arr = new int[n + 1][n + 1];

        StringTokenizer st;

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;  //양방향 그래프 추가
        }

        dfs(1);
        System.out.println(cnt);

    }

    static void dfs(int a) {
        //방문처리
        visit[a] = true;

        //인접 행렬 탐색
        for(int i=1; i<n + 1; i++) {
            //방문 하지 않았고, 정점이 연결되어 있다면
            if(!visit[i] && arr[a][i] == 1) {
                dfs(i);
                cnt++; //감염된 컴퓨터수 증가
            }
        }
    }
}
