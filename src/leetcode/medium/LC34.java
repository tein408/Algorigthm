package leetcode.medium;

public class LC34 {

    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                ans = mid;
                break;
            }
            else if(nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        left = right = ans;
        if(ans != -1) {
            for(int i=ans-1; i>=0; i--) {
                if(nums[i] == target)
                    left = i;
                else
                    break;
            }
            for(int i=ans+1; i<nums.length; i++) {
                if(nums[i] == target)
                    right = i;
                else
                    break;
            }
        }
        return new int[] {left, right};
    }

}
