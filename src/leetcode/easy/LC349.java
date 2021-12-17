package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Boolean> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i : nums1)
            map.put(i, true);

        for(int i : nums2) {
            if(map.containsKey(i) && map.get(i)) {
                list.add(i);
                map.put(i, false);
            }
        }

        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            ans[i] = list.get(i);

        return ans;
    }

}
