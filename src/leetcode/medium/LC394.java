package leetcode.medium;

import java.util.Stack;

public class LC394 {

    public String decodeString(String s) {
        //s의 문자열 중 [] 안의 문자열을 담아서 저장할 스택
        Stack<String> stack = new Stack<>();
        String ans = "";
        String temp = "";

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            // ] 가 아니라면 stack에 넣음
            if(c != ']') {
                stack.push(c + "");
            }
            // ] 라면
            else if(c == ']'){
                //stack이 비어있지 않고, 숫자가 나올때까지 pop하면서 temp에 저장
                int loopNum = 0;
                String n = "";
                while (stack.peek().charAt(0) >= 'a' && stack.peek().charAt(0) <= 'z'){
                    temp = stack.pop() + temp;
                }

                char t = stack.peek().charAt(0);

                if (t == '[') {
                    stack.pop();
                    while (!stack.isEmpty() && stack.peek().charAt(0) >= '0' && stack.peek().charAt(0) <= '9'){
                        n += stack.pop();
                    }
                    String a = "";
                    for(int k=n.length()-1; k>=0; k--) {
                        a += n.charAt(k);
                    }
                    loopNum = Integer.parseInt(a);

                    for(int j=0; j<loopNum; j++) {
                        stack.push(temp);
                    }
                }
            }
            temp = "";

        }

        while(!stack.isEmpty()) {
            ans = stack.pop() + ans;
        }

        return ans;
    }

}
