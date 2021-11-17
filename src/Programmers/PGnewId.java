package Programmers;

public class PGnewId {

    public static String solution(String new_id) {
        String answer = "";

        new_id = new_id.toLowerCase();
        answer = two(new_id);
        answer = three(answer);
        answer = four(answer);

        if(answer.length() == 0) {
            answer += "a";
        }

        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if(answer.charAt(answer.length()-1) == '.')
                answer = answer.substring(0, 14);
        }

        if(answer.length() < 3) {
            answer = seven(answer);
        }

        return answer;
    }

    static String two(String str) {
        String res = "";
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z')
                res += c;
            if(c >= '0' && c <= '9')
                res += c;
            if(c == '-' || c == '_' || c =='.')
                res += c;
        }
        return res;
    }

    static String three(String str) {
        String res = "";
        if(str.length() < 2)
            return str;

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(i == 0)
                res += c;
            else if(c == '.' && str.charAt(i-1) == '.') {
                continue;
            } else {
                res += c;
            }
        }
        return res;
    }

    static String four(String str) {
        String res = "";
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(i==0 || i==str.length()-1) {
                if(c != '.')
                    res += c;
            } else {
                res += c;
            }
        }
        return res;
    }

    static String seven(String str) {
        char last = str.charAt(str.length()-1);

        while(true) {
            if(str.length() == 3)
                break;
            str += last;
        }
        return str;
    }

    public static void main(String[] args) throws Exception {
        String str = "...!@BaT#*..y.abcdefghijklm";
        //String str = "=.=";
        System.out.println(solution(str));
    }
}
