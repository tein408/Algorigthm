package leetcode.medium;

import java.util.Arrays;

public class LC238 {

/*    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        //오른쪽 값 곱하고
        for(int i=1; i<nums.length; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }
        //왼쪽 값 곱하고
        for(int i=nums.length-2; i>=0; i--) {
            nums[i] = nums[i] * nums[i+1];
        }
        //결과 계산
        for(int i=0; i<nums.length-1; i++) {
            ans[i] = ans[i] * nums[i+1];
        }
        return ans;
    }*/

    //for문 2개
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        int a = 1;
        ans[0] = 1;

        for(int i=1; i<nums.length; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }

        for(int i=nums.length-1; i>=0; i--) {
            ans[i] *= a;
            a *= nums[i];
        }

        return ans;
    }


}
