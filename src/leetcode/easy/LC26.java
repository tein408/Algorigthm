package leetcode.easy;

public class LC26 {

    public int removeDuplicates(int[] nums) {
        int ans = 1;
        for(int i=0; i<nums.length - 1; i++) {
            if(nums[i] != nums[i+1])
                nums[ans++] = nums[i+1];
        }
        return ans;
    }

}
