package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class P11279 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(bf.readLine());
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());

        while(n-- > 0) {
            int temp = Integer.parseInt(bf.readLine());

            if(temp > 0)
                que.add(temp);
            if(temp == 0) {
                if(que.isEmpty())
                    sb.append(0).append("\n");
                else
                    sb.append(que.poll()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
