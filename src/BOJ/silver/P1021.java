package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P1021 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();

        for(int i=1; i<=n; i++) {
            list.add(i);
        }

        int cnt = 0;
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<m; i++) {
            int temp = Integer.parseInt(st.nextToken());

            while(temp != list.get(0)) {
                if(list.indexOf(temp) <= list.size() / 2) {
                    int first = list.getFirst();
                    list.removeFirst();
                    list.addLast(first);
                } else {
                    int last = list.getLast();
                    list.removeLast();
                    list.addFirst(last);
                }
                cnt++;
            }
            list.removeFirst();
        }

        System.out.println(cnt);

    }
}
