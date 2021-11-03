package leetcode.easy;

import java.util.Arrays;

public class LC977 {

//    public int[] sortedSquares(int[] nums) {
//        int[] arr = nums;
//        for(int i=0; i<arr.length; i++) {
//            arr[i] = nums[i] * nums[i];
//        }
//        Arrays.sort(arr);
//        return arr;
//    }

    //two pointer로 풀기
    public static int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            nums[i] *= nums[i];
        }

        int[] ans = new int[nums.length];
        //새 배열에 들어갈 위치를 지정할 idx
        int idx = nums.length - 1;

        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int start = nums[left];
            int end = nums[right];
            if(start > end) {
                left++;
                ans[idx--] = start;
            }
            else {
                right--;
                ans[idx--] = end;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] res = sortedSquares(nums);
        for(int i: res)
            System.out.println(i);
    }

}
