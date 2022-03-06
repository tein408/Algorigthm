package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LC128 {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums)
            set.add(num);

        int ans = 0;

        for(int num : nums) {
            if(set.contains(num - 1))
                continue;

            int len = 1;
            while(set.contains(++num)) {
                len++;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }

}
