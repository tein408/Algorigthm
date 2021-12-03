package Programmers.level2;

//문자열 압축
public class PG60057 {

    public static int solution(String s) {

        int len = s.length();
        int min = len;

        for(int i=1; i<=len/2; i++) {
            int cnt = 1;
            int result = 0;

            String front = s.substring(0,i);
            String next;

            for(int j=i; j<len; j+=i) {
                if(j+i < len) {
                    next = s.substring(j, j+i);
                } else {
                    next = s.substring(j);
                }

                if(front.equals(next)) {
                    cnt++;
                } else {
                    if(cnt > 1) {
                        result += String.valueOf(cnt).length();
                    }
                    result += next.length();
                    front = next;
                    cnt = 1;
                }
            }
            if(cnt > 1) {
                result += String.valueOf(cnt).length();
            }
            result += i;

            min = Math.min(min, result);
        }

        return min;
    }

}
