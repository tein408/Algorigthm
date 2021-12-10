package leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LC491 {

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();

        if(nums.length < 2) {
            return answer;
        }

        HashSet<List<Integer>> set = new HashSet<>();
        solv(nums, 0, new ArrayList<>(), set);
        return new ArrayList<List<Integer>>(set);
    }

    void solv(int[] nums, int idx, List<Integer> list, HashSet<List<Integer>> set) {
        if(list.size() > 1)
            set.add(new ArrayList<>(list));

        for(int i=idx; i<nums.length; i++) {
            if(list.size() == 0 || list.get(list.size()-1) <= nums[i]) {
                list.add(nums[i]);
                solv(nums, i+1, list, set);
                list.remove(list.size()-1);
            }
        }
    }

}
