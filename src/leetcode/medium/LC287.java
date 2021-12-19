package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LC287 {
        //Map 이용 44ms, 48.8mb
    /*public int findDuplicate(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for(int i : nums) {
            cnt.put(i, cnt.getOrDefault(i, 0)+1);
        }
        int ans = 0;
        for(int i=0; i<cnt.size(); i++) {
            if(cnt.get(nums[i]) > 1) {
                ans = nums[i];
                break;
            }
        }
        return ans;
    }*/

    //boolean 이용 1ms 56.2mb
    public int findDuplicate(int[] nums) {
        boolean[] isVisit = new boolean[nums.length];
        int idx = 0;
        //최초엔 모든 원소들이 false이므로 실행
        while(!isVisit[nums[idx]]) {
            //하나씩 방문 하면서 true로 체크
            //두번 방문한 원소 등장시 true값을 가지고 있으므로 while 조건에 맞지 않게 되고,
            //루프에서 빠져나감.
            isVisit[nums[idx++]] = true;
        }
        return nums[idx];
    }

}
