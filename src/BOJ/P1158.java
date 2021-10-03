package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1158 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();

        for(int i=0; i<n; i++) {
            queue.add(i+1);
        }

        while(true) {

            for(int i=0; i<k-1; i++) {
                int a = queue.poll();
                queue.add(a);
            }
            int b = queue.poll();
            result.add(b);

            if(queue.size() == 0)
                break;

        }

        String re = result.toString();

        System.out.println("<" + re.substring(1,re.length()-1) + ">");

    }
}
