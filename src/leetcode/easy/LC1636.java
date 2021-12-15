package leetcode.easy;

import java.util.*;

public class LC1636 {

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        //map의 value를 기준으로 정렬
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (v1, v2) -> {
            return map.get(v1) == map.get(v2) ? v2 - v1 : map.get(v1) - map.get(v2);
        });

        int[] ans = new int[nums.length];
        int idx = 0;
        //map의 value를 기준으로 정렬된 빈도수
        for(int i=0; i<list.size(); i++) {
            //map의 키가 가진 value == nums[i]의 빈도수
            for(int j=0; j<map.get(list.get(i)); j++) {
                ans[idx++] = list.get(i);
            }
        }

        return ans;
    }

}
