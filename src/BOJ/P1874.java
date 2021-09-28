package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1874 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        int now = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++) {
            int val = Integer.parseInt(bf.readLine());

            if(val > now) {
                for(int j=now; j<val; j++) {
                    stack.push(j+1);
                    sb.append("+\n");
                }
                now = val;
            }
            else if(stack.peek() != val) {
                System.out.println("NO");
                return;
                //반복문 내에서 return 사용 : 반복문이 포함된 함수 자체를 종료
                //break : 반복문을 빠져나감. 함수는 여전히 실행됨.
            }
            stack.pop();
            sb.append("-\n");
        }

        System.out.println(sb);

    }

}
