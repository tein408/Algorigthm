package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P5430 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(bf.readLine());

        while(t-- > 0) {
            String p = bf.readLine();
            int n = Integer.parseInt(bf.readLine());
            Deque<String> deque = new LinkedList<>();

            String arr = bf.readLine();
            arr = arr.replace("[", "");
            arr = arr.replace("]", "");

            StringTokenizer st = new StringTokenizer(arr, ",");
            for(int i=0; i<n; i++) {
                String temp = st.nextToken();
                deque.add(temp);
            }

            boolean isReverse = false;
            boolean isError = false;

            for(int i=0; i<p.length(); i++) {
                char c = p.charAt(i);
                if(c == 'R') {
                    isReverse = !isReverse;
                } else {
                    if(deque.size() == 0) {
                        isError = true;
                        sb.append("error").append("\n");
                        break;
                    }
                    if(!isReverse)
                        deque.removeFirst();
                    else
                        deque.removeLast();
                }
            }

            if(!deque.isEmpty()) {
                sb.append("[");
                while(!deque.isEmpty()) {
                    sb.append(isReverse ? deque.removeLast() : deque.removeFirst());
                    if(deque.size() != 0)
                        sb.append(",");
                }
                sb.append("]").append("\n");
            } else {
                if(!isError)
                    sb.append("[]").append("\n");
            }
        }

        System.out.println(sb);
    }
}
