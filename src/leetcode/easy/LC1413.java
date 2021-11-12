package leetcode.easy;

public class LC1413 {

    public int minStartValue(int[] nums) {
        int ans = 0;
        int sum = 0;
        for(int i : nums) {
            sum += i;
            ans = Math.min(ans, sum);
        }
        return ans > 0 ? 1 : 1-ans;
    }

}
