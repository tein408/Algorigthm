package leetcode.easy;

public class LC13 {

    static int romanToInt(String s) {
        int len = s.length();
        int ans = 0;

        for(int i=0; i<len; i++) {
            char c = s.charAt(i);
            if(c == 'I') {
                ans += 1;
            }
            else if(c == 'V') {
                if(i > 0 && s.charAt(i-1) == 'I') {
                    ans -= 2;
                }
                    ans += 5;
            }
            else if(c == 'X') {
                if(i > 0 && s.charAt(i-1) == 'I') {
                    ans -= 2;
                }
                ans += 10;
            }
            else if(c == 'L') {
                if(i > 0 && s.charAt(i-1) == 'X') {
                    ans -= 20;
                }
                ans += 50;
            }
            else if(c == 'C') {
                if(i > 0 && s.charAt(i-1) == 'X') {
                    ans -= 20;
                }
                ans += 100;
            }
            else if(c == 'D') {
                if(i > 0 && s.charAt(i-1) == 'C') {
                    ans -= 200;
                }
                ans += 500;
            }
            else if(c == 'M') {
                if(i > 0 && s.charAt(i-1) == 'C') {
                    ans -= 200;
                }
                ans += 1000;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "IV";
        System.out.println(romanToInt(str));
    }

}
