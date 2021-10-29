package leetcode;

import java.util.StringTokenizer;

public class LC2047 {
    public static void main(String[] args) throws Exception {
        //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //String s = "alice and  bob are playing stone-game10";
        //String s = "he bought 2 pencils, 3 erasers, and 1  pencil-sharpener.";
        String s = "-";
        int ans = countValidWords(s);
        System.out.println(ans);

    }

    static int countValidWords(String sentence) {
        //^([a-z]+ 문자로 시작하고, 문자가 한번 또는 여러번 나옴
        //-? 하이픈이 없거나 한개 있음
        //? 앞 문자가 없거나 하나 있음
        //(!|\.|,)? 느낌표나 마침표나 쉼표 셋 중 하나가 한번 나옴
        //$ 문자열 종료
        String reg = "^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$";
        
        //숫자 이외의 문자가 하나 또는 여러번
        String num = "[^0-9]+";

        StringTokenizer st = new StringTokenizer(sentence, " ");
        int ans = 0;

        while(st.hasMoreElements()) {
            String str = st.nextToken();
            if(str.matches(reg) && str.matches(num)) {
                ans++;
            }
        }
        return ans;
    }

}
