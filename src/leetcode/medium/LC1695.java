package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LC1695 {

    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0, max = 0;
        int left = 0, right = 0;

        //둘다 0부터 시작하니까 nums 길이보다 작을때까지만
        while(right < nums.length && left <nums.length) {
            //set에 없으면
            if(!set.contains(nums[right])) {
                //set에 추가
                set.add(nums[right]);
                //합계도 구하고
                sum += nums[right];
                //한칸 뒤로 밀고
                right++;
                //최대 합계도 저장해둠
                max = Math.max(max, sum);
            }
            //set에 있으면 중복 원소
            else {
                //set에서 지우고
                set.remove(nums[left]);
                //sum에서도 빼고
                sum -= nums[left];
                left++;
            }
        }
        return max;
    }

}















/*
* while(end < nums.length) {
* if(!set.contain(nums[end]) {
* sum+=nums[end];
* set.add(nums[end]);
* end++;
* max = Math.max(max, sum);
* }
* else {
* sum -= nums[start];
* set.remove(nums[start]);
* start++;
* */