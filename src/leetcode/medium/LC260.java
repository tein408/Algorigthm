package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LC260 {

    public static int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int[] ans = new int[2];
        int idx = 0;

        for(int i=0; i<nums.length; i++) {
            if(map.get(nums[i]) == 1) {
                ans[idx] = nums[i];
                idx++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        int[] res = singleNumber(nums);
        for(int i:res) System.out.println(i);
    }

}
