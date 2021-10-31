package leetcode;

public class LC9 {
    public boolean isPalindrome(int x) {
        boolean res = false;

        String n = x + "";

        if(n.length() == 1){
            return true;
        }
        else {
            String temp = "";
            for(int i=n.length()-1; i>=0; i--) {
                temp += n.charAt(i);
            }
            if(n.equals(temp))
                res = true;
            else
                res = false;
        }

        return res;
    }
}
