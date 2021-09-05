package leetcode;

import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int a, b;
        int[] arr = new int[2];
        for(int i=0; i<nums.length; i++) {
            a = nums[i];
            for(int j=i+1; j<nums.length; j++){
                b = nums[j];
                sum = a+b;
                if(sum == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
            if(sum == target) break;
        }
        return arr;
    }
}