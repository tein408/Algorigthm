package leetcode.medium;

public class LC33 {

    public int search(int[] nums, int target) {
        // [2,1]
        // target O, X

        // Time Complexity O(log n)
        // n/2, n/2 * 1/2 ...
        // Space Complexity O(1)

        // edge
        // nums.length == 1
        // target == nums[0] || target != nums[0]
        if(nums.length == 1) {
            if(nums[0] == target)
                return 0;
            return -1;
        }

        int left = 0, right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[left] == target)
                return left;
            else if(nums[right] == target)
                return right;
            else if(nums[mid] == target)
                return mid;

            else if(nums[left] < nums[mid]) {
                // [4,5,6,7,0,1,2] target 5
                // [4,5,6,7,0,1,2] target 1
                if(nums[left] < target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // [5,6,7,1,2,3,4] target 5
                // [5,6,7,1,2,3,4] target 3
                if(nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }

        return -1;
    }

}
