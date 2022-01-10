package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LC1010 {

    public int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;

        for(int i=0; i<time.length; i++) {
            int remainder = time[i] % 60;
            int diff = (60 - remainder) % 60;
            cnt += map.getOrDefault(diff, 0);
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return cnt;
    }

}
