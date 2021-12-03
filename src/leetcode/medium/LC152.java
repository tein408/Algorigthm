package leetcode.medium;

public class LC152 {

    public int maxProduct(int[] nums) {
        if(nums.length == 1)
            return nums[0];

        int min = nums[0], max = nums[0], ans = nums[0];
        //- * - = +
        //+ * - = -
        for(int i=1; i<nums.length; i++) {
            int tempMin = min * nums[i];
            int tempMax = max * nums[i];
            min = Math.min(nums[i], Math.min(tempMax, tempMin));
            max = Math.max(nums[i], Math.max(tempMax, tempMin));
            ans = Math.max(ans, max);
        }
        return ans;
    }

}
