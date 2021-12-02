package leetcode.easy;

import java.util.Stack;

public class LC844 {

/*    //문자열 메서드 이용한 풀이 17ms
    public static boolean backspaceCompare(String s, String t) {
        if(s == "" || t == "")
            return false;
        String a = s;
        s = "";
        for(int i=0; i<a.length(); i++) {
            char temp = a.charAt(i);
            if(temp == '#')
                s = s.replaceAll(".$", "");
            else
                s += temp;
        }
        a = t;
        t = "";
        for(int i=0; i<a.length(); i++) {
            char temp = a.charAt(i);
            if(temp == '#')
                t = t.replaceAll(".$", "");
            else
                t += temp;
        }
        return s.equals(t);
    }*/

    //stack을 사용한 풀이
    public static boolean backspaceCompare(String s, String t) {
        Stack<String> ss = new Stack<>();
        Stack<String> tt = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != '#') {
                ss.push(s.charAt(i)+"");

            } else if(!ss.isEmpty()){
                ss.pop();
            }
        }
        for(int i=0; i<t.length(); i++) {
            if(t.charAt(i) != '#') {
                tt.push(t.charAt(i)+"");
            } else if(!tt.isEmpty()){
                tt.pop();
            }
        }
        return ss.toString().equals(tt.toString());
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t));
    }

}
