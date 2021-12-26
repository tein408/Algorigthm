package leetcode.easy;

public class LC171 {

    public int titleToNumber(String columnTitle) {
        char[] c = columnTitle.toCharArray();

        int ans = 0;

        for(int i=0; i<c.length; i++) {
            ans = ans * 26 + (c[i] - 'A' + 1);
        }

        return ans;
    }

}
