package leetcode.medium;

import java.util.LinkedList;
import java.util.List;

public class LC229 {
    //Boyer-moore majority Vote algorithm
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new LinkedList<>();

        if(nums == null) {
            return list;
        }

        int cnt1 = 0, cnt2 = 0, maj1 = 0, maj2 = 0;

        for(int i : nums) {
            if(i == maj1) {
                cnt1++;
            } else if(i == maj2) {
                cnt2++;
            } else if(cnt1 == 0) {
                maj1 = i;
                cnt1 = 1;
            } else if(cnt2 == 0) {
                maj2 = i;
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = cnt2 = 0;

        for(int i : nums) {
            if(i == maj1)
                cnt1++;
            else if(i == maj2)
                cnt2++;
        }

        if(cnt1 > nums.length/3)
            list.add(maj1);
        if(cnt2 > nums.length/3)
            list.add(maj2);

        return list;
    }

}
