package leetcode.medium;

public class LC153 {

    public int findMin(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        return search(nums);
    }

    int search(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] < nums[right])
                right = mid;
            else if(nums[mid] > nums[right])
                left = mid + 1;
        }
        return nums[left];
    }

}
