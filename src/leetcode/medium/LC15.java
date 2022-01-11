package leetcode.medium;

import java.util.*;

public class LC15 {

/*    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length < 3)
            return ans;

        Arrays.sort(nums);
        int left, right, sum;
        //한 개는 지정해두고 탐색 시작
        for(int i=0; i<nums.length - 2; i++) {
            //이전 값과 같으면 넘어감
            if(i > 0 && nums[i] == nums[i-1])
                continue;

            left = i+1;
            right = nums.length -1;

            sum = -nums[i];

            while(left < right) {
                if(nums[left] + nums[right] == sum) {
                    ans.add(Arrays.asList(nums[left], nums[right], nums[i]));
                    left++;
                    right--;
                    //중복 제거
                    while(left < right && nums[left] == nums[left-1])
                        left++;
                    while(left < right && nums[right] == nums[right+1])
                        right--;
                } else if(nums[left] + nums[right] > sum) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return ans;
    }*/

    // Set 이용
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> answer  = new HashSet<>();
        if (nums.length < 3)
            return new ArrayList<>(answer);
        
        Arrays.sort(nums);
        
        for (int i=0; i<nums.length-2;i++){
            int left = i+1;
            int  right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {
                    answer.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
                else if (sum > 0)
                    right--;
                else if (sum < 0)
                    left++;
            }

        }

        return new ArrayList<>(answer);
    }

}
