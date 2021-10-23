package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class P4949 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = bf.readLine();
            if(str.equals("."))
                break;
            System.out.println(stack(str));
        }

    }

    static String stack(String str) {
        int len = str.length();
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<len; i++) {
            char temp = str.charAt(i);

            if(temp == '(' || temp == '[')
                stack.push(temp);

            else if(temp == ')') {
                if(stack.empty() || stack.peek() != '(') {
                    return "no";
                }
                else stack.pop();
            }

            else if(temp == ']') {
                if(stack.empty() || stack.peek() != '[') {
                    return "no";
                }
                else stack.pop();
            }

        }

        if(stack.isEmpty())
            return "yes";
        else
            return "no";
    }


}
