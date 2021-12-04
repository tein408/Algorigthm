package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P11725 {

    static int n;
    static int[] parent;
    static boolean[] visit;
    static List<Integer>[] list;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        n = Integer.parseInt(bf.readLine());
        list = new ArrayList[n+1];
        visit = new boolean[n+1];
        parent = new int[n+1];

        for(int i=1; i<=n; i++) {
            list[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for(int i=0; i<n-1; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        search(1);

        for(int i=2; i<=n; i++) {
            sb.append(parent[i]).append("\n");
        }
        System.out.println(sb);

    }

    static void search(int a) {
        Queue<Integer> que = new LinkedList<>();
        que.add(a);
        visit[a] = true;
        while(!que.isEmpty()) {
            int n = que.poll();
            for(int i : list[n]) {
                if(!visit[i]) {
                    visit[i] = true;
                    parent[i] = n;
                    que.add(i);
                }
            }
        }
    }


}
