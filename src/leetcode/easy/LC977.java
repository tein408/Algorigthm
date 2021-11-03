package leetcode.easy;

import java.util.Arrays;

public class LC977 {

    public int[] sortedSquares(int[] nums) {
        int[] arr = nums;
        for(int i=0; i<arr.length; i++) {
            arr[i] = nums[i] * nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }

}
