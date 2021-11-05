package leetcode.easy;

import java.util.StringTokenizer;

public class LC557 {

    public static String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        StringBuffer sb = new StringBuffer();
        int token = st.countTokens();
        while(st.hasMoreElements()) {
            String str = st.nextToken();
            char[] c = new char[str.length()];
            for(int i=0; i<c.length; i++)
                c[i] = str.charAt(i);

            int left = 0;
            int right = c.length-1;

            while(left < right) {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }

            sb.append(c);
            token--;
            if(token > 0)
                sb.append(" ");

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

}
