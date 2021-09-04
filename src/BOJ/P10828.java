package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10828 {

    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack();
        for(int i=0;i<num;i++){
            String s = bf.readLine();
            switch (s.charAt(0)){
                case 'p':
                    if(s.charAt(1)=='u') stack.push(Integer.parseInt(s.split(" ")[1]));
                    else sb.append(stack.empty()? -1:stack.pop()).append("\n");
                    break;
                case 's' :
                    sb.append(stack.size()).append("\n");
                    break;
                case 'e' :
                    sb.append(stack.empty()? 1:0).append("\n");
                    break;
                case 't' :
                    sb.append(stack.empty()? -1:stack.peek()).append("\n");
                    break;
            }

           /* if(s.startsWith("push")){
                stack.push(s.split(" ")[1]);
            }
            else if(s.equals("pop")) {
                sb.append(stack.empty()? -1:stack.pop()).append("\n");
            }
            else if(s.equals("size")) {
                sb.append(stack.size()).append("\n");
            }
            else if(s.equals("empty")) {
                sb.append(stack.empty()? 1:0).append("\n");
            }
            else if(s.equals("top")) {
                sb.append(stack.empty()? -1:stack.peek()).append("\n");
            }*/
        }
        System.out.println(sb);


    }

}