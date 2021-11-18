package leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LC448 {
    //Hash 이용
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++)
            set.add(nums[i]);

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(set.contains(i+1))
                continue;
            else
                list.add(i+1);
        }
        return list;
    }

}
