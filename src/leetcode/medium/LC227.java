package leetcode.medium;

import java.util.Stack;

public class LC227 {

    public int calculate(String s) {
        if(s == null || s.length() == 0)
            return 0;

        //공백 제거
        s = s.replace(" ", "");
        int ans = 0;
        char oper = '+';

        Stack<Integer> stack = new Stack<>();
        int curr = 0;

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            // 숫자
            if(c >= '0' && c <= '9') {
                curr = (curr * 10) + (c - '0');
            }
            // !숫자
            if(i == s.length() - 1 || !(c >= '0' && c <= '9') ) {
                if(oper == '+') {
                    stack.push(curr);
                }
                if(oper == '-') {
                    stack.push(-curr);
                }
                if(oper == '*') {
                    stack.push(stack.pop() * curr);
                }
                if(oper == '/') {
                    stack.push(stack.pop() / curr);
                }
                oper = s.charAt(i);
                curr = 0;
            }
        }

        while(!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }

}
