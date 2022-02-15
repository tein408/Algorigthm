package leetcode.easy;

public class LC1991 {

    public int findMiddleIndex(int[] nums) {
        int ans = -1;

        int total = 0;
        for(int i : nums)
            total += i;

        int left = 0, right = 0;

        for(int i=0; i<nums.length; i++) {
            right = total - left;
            left += nums[i];
            if(left == right) {
                ans = i;
                break;
            }
        }

        return ans;
    }

}
