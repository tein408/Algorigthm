package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P17413 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        String str = bf.readLine();
        boolean chk = false;

        for(int i=0; i<str.length(); i++) {

            char c = str.charAt(i);

            if(c == '<') {
                chk = true;
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(str.charAt(i));
            }
            else if(c == '>') {
                chk = false;
                sb.append(str.charAt(i));
            }
            else if(chk) {
                sb.append(str.charAt(i));
            }
            else if(!chk) {
                if(c == ' ') {
                    while(!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(str.charAt(i));
                }
                else {
                    stack.push(c);
                }
            }
        }

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);

    }
}
