package leetcode.medium;

public class LC162 {

    public int findPeakElement(int[] nums) {
        if(nums.length == 1)
            return nums.length-1;
        return search(nums);
    }

    int search(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[mid+1])
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

}
