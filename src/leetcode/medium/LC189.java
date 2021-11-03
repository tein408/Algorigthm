package leetcode.medium;

public class LC189 {

    public static void rotate(int[] nums, int k) {
        if(nums.length < 2) {
            return;
        }
        if(nums.length < k) {
            k = k%nums.length;
        }
        int[] arr = new int[nums.length];
        int idx = 0;
        for(int i=0; i<nums.length; i++) {
            idx = i+k;
            if(idx >= nums.length)
                idx -= nums.length;
            arr[idx] = nums[i];
        }
        for(int i=0; i<nums.length; i++) {
            nums[i] = arr[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        rotate(nums, 5);
        for(int i : nums)
            System.out.println(i);
    }

}
