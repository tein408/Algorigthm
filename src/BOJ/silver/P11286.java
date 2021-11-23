package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P11286 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        PriorityQueue<Integer> que = new PriorityQueue<>((o1, o2) -> {
            int a = Math.abs(o1);
            int b = Math.abs(o2);
            if(a==b)
                return o1 > o2 ? 1 : -1;
            return a - b;
        });

        int n = Integer.parseInt(bf.readLine());

        while(n-- > 0) {
            int temp = Integer.parseInt(bf.readLine());

            if(temp != 0)
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