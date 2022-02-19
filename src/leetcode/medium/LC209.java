package leetcode.medium;

public class LC209 {

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = n + 1;

        int sum = 0;
        int left = 0;

        // Time Complexity : O(N)
        // Space Complexity : O(1)

        for(int i=0; i<n; i++) {
            sum += nums[i];
            while(sum >= target) {
                ans = Math.min(ans, i - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return ans != n+1? ans : 0;
    }

}
