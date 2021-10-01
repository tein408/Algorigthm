package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class P10866 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> deque = new ArrayDeque<>();
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(bf.readLine());

        for(int i=0; i<n; i++) {
            String str = bf.readLine();
            char c = str.charAt(0);

            switch (c) {
                case 'p' :
                    if(str.charAt(5) == 'f')
                        deque.addFirst(str.split(" ")[1]);
                    else if(str.charAt(5) == 'b')
                        deque.addLast(str.split(" ")[1]);
                    else if(str.charAt(4) == 'f') {
                        String pollFirst = deque.pollFirst();
                        sb.append(pollFirst != null? pollFirst:-1).append("\n");
                    }
                    else if(str.charAt(4) == 'b') {
                        String pollLast = deque.pollLast();
                        sb.append(pollLast != null? pollLast:-1).append("\n");
                    }
                    break;
                case 's' :
                    sb.append(deque.size()).append("\n");
                    break;
                case 'e' :
                    sb.append(deque.isEmpty()? 1:0).append("\n");
                    break;
                case 'f' :
                    String peekFirst = deque.peekFirst();
                    sb.append(peekFirst != null? peekFirst:-1).append("\n");
                    break;
                case 'b' :
                    String peekLast = deque.peekLast();
                    sb.append(peekLast != null? peekLast:-1).append("\n");
                    break;
            }
        }

        System.out.println(sb);


    }
}

