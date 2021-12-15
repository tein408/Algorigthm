package leetcode.easy;

public class LC905 {

    public int[] sortArrayByParity(int[] nums) {
        if(nums.length < 2)
            return nums;

        int[] ans = new int[nums.length];
        //ans의 위치에 저장할 index 두개
        int left = 0, right = nums.length - 1;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] %2 == 0) {
                //짝수면 왼쪽부터 저장
                ans[left++] = nums[i];
            } else {
                //홀수면 오른쪽 끝에서 저장
                ans[right--] = nums[i];
            }
        }
        return ans;
    }

}
