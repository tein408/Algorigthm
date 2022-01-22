package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class P9935 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String bomb = bf.readLine();
        int m = bomb.length();

        Stack<Character> stack = new Stack<>();

        for (int i=0; i<str.length(); i++) {
            stack.push(str.charAt(i));

            if (stack.size() >= m) {
                boolean flag = true;

                for (int j=0; j<m; j++) {
                    if(stack.get(stack.size() - m + j) != bomb.charAt(j)) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    for (int j=0; j<m; j++) {
                        stack.pop();
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack)
            sb.append(c);

        if(sb.length() > 0)
            System.out.println(sb);
        else
            System.out.println("FRULA");
    }
}
