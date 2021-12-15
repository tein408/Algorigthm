package leetcode.easy;

public class LC922 {

    public int[] sortArrayByParityII(int[] nums) {
        if(nums.length < 2)
            return nums;

        int[] ans = new int[nums.length];
        //홀, 짝 위치 지정
        int left = 0, right = 1;
        for(int i=0; i<nums.length; i++) {
            //짝수면
            if(nums[i] %2 == 0) {
                //짝수번째 위치에 저장
                ans[left] = nums[i];
                left += 2;
            } else {
                //홀수면 홀수 위치에 저장
                ans[right] = nums[i];
                right += 2;
            }
        }
        return ans;
    }

}
