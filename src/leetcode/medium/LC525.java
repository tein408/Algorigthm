package leetcode.medium;

import java.util.HashMap;

public class LC525 {

    public int findMaxLength(int[] nums) {
        int sum = 0;
        int cnt = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        for (int i=0; i<nums.length; i++) {
            if(nums[i] == 1)
                sum++;
            else
                sum--;

            if(map.containsKey(sum))
                cnt = Math.max(cnt, i-map.get(sum));
            else
                map.put(sum, i);
        }

        return cnt;
    }

}
