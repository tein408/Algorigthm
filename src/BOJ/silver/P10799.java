package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10799 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int len = str.length();
        Stack<Character> stack = new Stack<>();
        int stick = 0;

        for(int i=0; i<len; i++) {
            char c = str.charAt(i);
            // ( 이면 push
            if(c == '(') {
                stack.push(c);
            }
            // ) 이면
            else if(c == ')') {
                // pop 한 뒤
                stack.pop();
                // 그 전 문자열과 비교
                // 항상 완벽한 괄호이므로 stack에서 peek 하는것 보단 문자열에서 비교
                // stack.pop()을 하였으므로 stack이 비어있을 수 있음.
                // ex) str = "()" 인 경우 stack.empty() == true;
                if(str.charAt(i-1) == '(') {
                    //레이저를 만난 경우
                    //그 전의 스틱 수가 유지되므로 누적시켜줌.
                    stick += stack.size();
                }
                else {
                    //레이저가 아닐 경우 스틱++
                    stick++;
                }
            }
        }

        System.out.println(stick);

    }
}
