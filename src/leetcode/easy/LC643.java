package leetcode.easy;

public class LC643 {

    public double findMaxAverage(int[] nums, int k) {
        double ans = 0;
        long sum = 0;

        for(int i=0; i<k; i++) {
            sum += nums[i];
        }

        ans = sum;

        for(int i=k; i<nums.length; i++) {
            sum = sum - nums[i-k] + nums[i];
            ans = Math.max(ans, sum);
        }

        return ans / k;
    }

}
