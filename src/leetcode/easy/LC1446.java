package leetcode.easy;

public class LC1446 {

    public int maxPower(String s) {
        int left = 0, right = 0, max = 0;
        char[] c = s.toCharArray();
        while(left < s.length() && right < s.length()) {
            if(c[left] == c[right]) {
                max = Math.max(max, right - left + 1);
                right++;
            }
            else {
                left++;
            }
        }
        return max;
    }

}
