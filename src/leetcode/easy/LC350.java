package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int left = 0, right = 0;

        List<Integer> list = new ArrayList<>();

        while(left < nums1.length && right < nums2.length) {
            if(nums1[left] == nums2[right]) {
                list.add(nums1[left]);
                left++;
                right++;
            } else if(nums1[left] < nums2[right]) {
                left++;
            } else {
                right++;
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }

}
