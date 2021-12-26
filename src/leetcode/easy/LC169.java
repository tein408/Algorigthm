package leetcode.easy;

import java.util.Arrays;

public class LC169 {

/*    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }*/

    public static int majorityElement(int[] nums) {
        int cnt = 0;
        int max = 0;

        for(int i : nums) {
            if(cnt == 0) {
                max = i;
                cnt++;
            }
            else if(i == max)
                cnt++;
            else
                cnt--;
        }
        return max;
    }

}
