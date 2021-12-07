package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P7662 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(bf.readLine());

        while(t-- > 0) {
            int q = Integer.parseInt(bf.readLine());

            PriorityQueue<Integer> min = new PriorityQueue<>();
            PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
            Map<Integer, Integer> map = new HashMap<>();

            for(int i=0; i<q; i++) {
                st = new StringTokenizer(bf.readLine());
                String a = st.nextToken();

                if(a.equals("I")) {
                    int b = Integer.parseInt(st.nextToken());
                    min.add(b);
                    max.add(b);
                    map.put(b, map.getOrDefault(b, 0)+1);
                } else {
                    int b = Integer.parseInt(st.nextToken());
                    if(map.size() == 0)
                        continue;
                    if(b == 1)
                        delete(max, map);
                    else
                        delete(min, map);
                }
            }

            if(map.size() == 0)
                sb.append("EMPTY").append("\n");
            else {
                int n = delete(max, map);
                sb.append(n).append(" ");
                if(map.size() > 0)
                    n = delete(min, map);
                sb.append(n).append("\n");
            }

        }
        System.out.println(sb);
    }

    static int delete(Queue<Integer> q, Map<Integer, Integer> map) {
        int p = 0;
        while(true) {
            p = q.poll();

            int cnt = map.getOrDefault(p, 0);
            if(cnt == 0)
                continue;
            if(cnt == 1)
                map.remove(p);
            else
                map.put(p, cnt-1);
            break;
        }
        return p;
    }

}
