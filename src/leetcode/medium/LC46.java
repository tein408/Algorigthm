package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class LC46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solv(ans, nums, new ArrayList<Integer>());
        return ans;
    }

    void solv(List<List<Integer>> ans, int[] nums, List<Integer> list) {
        if(list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=0; i<nums.length; i++) {
            if(!list.contains(nums[i])) {
                list.add(nums[i]);
                solv(ans, nums, list);
                list.remove(list.size() - 1);
            }
        }
    }

}
