package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class P9012 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        String[] str = new String[n];

        for(int i=0; i<n; i++) {
            str[i] = bf.readLine();
        }

        for(int i=0; i<n; i++) {
            //한줄씩 읽어서 검사
            int len = str[i].length();
            System.out.println(answer(len, str[i]));
        }

    }

    static String answer(int len, String str) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<len; i++) {
            //한글자씩 검사
            char tempChar = str.charAt(i);

            // ( 이면 스택에 삽입
            if(tempChar == '(') {
                stack.push(tempChar);
            }
            // 스택이 비었으면 return NO
            else if(stack.isEmpty()) {
                return "NO";
            }
            // 그외 ) 이므로 출력
            else {
                stack.pop();
            }
        }

        // 위 과정 후 스택이 비었으면 괄호가 순서대로이므로
        if(stack.isEmpty()) {
            return "YES";
        }
        // 아니라면 return NO
        else {
            return "NO";
        }

    }

}
