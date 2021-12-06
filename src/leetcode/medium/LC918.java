package leetcode.medium;

public class LC918 {

    public int maxSubarraySumCircular(int[] nums) {
        if(nums.length == 1)
            return nums[0];

        int sum, globalMax, globalMin, currMax, currMin;
        sum = globalMax = globalMin = currMax = currMin = nums[0];

        for(int i=1; i<nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            globalMax = Math.max(globalMax, currMax);

            currMin = Math.min(nums[i], currMin + nums[i]);
            globalMin = Math.min(globalMin, currMin);

            sum += nums[i];
        }
        if(sum == globalMin)
            return globalMax;
        return Math.max(globalMax, sum - globalMin);
    }

}
