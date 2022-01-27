package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P2161 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Queue<Integer> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=n; i++) {
            que.add(i);
        }

        while(que.size() != 1) {
            sb.append(que.poll()).append(" ");
            que.add(que.poll());
        }

        sb.append(que.poll());
        System.out.println(sb);
    }
}
