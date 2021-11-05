package leetcode.easy;

import java.util.Stack;

public class LC20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean res = true;

        if(s.length()%2 == 1)
            return false;

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if(c == ')') {
                if(stack.isEmpty() || stack.peek() != '(')
                    return false;
                else stack.pop();
            }
            else if(c == '}') {
                if(stack.isEmpty() || stack.peek() != '{')
                    return false;
                else stack.pop();
            }
            else if(c == ']') {
                if(stack.isEmpty() || stack.peek() != '[')
                    return false;
                else stack.pop();
            }
        }

        if(!stack.isEmpty())
            res = false;

        return res;
    }

}
