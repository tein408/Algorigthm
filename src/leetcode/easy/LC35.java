package leetcode.easy;

public class LC35 {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int ans = -1;
        int mid = -1;

        while(left <= right) {
            mid = (left + right) / 2;
            ans = mid;

            if(ans >= nums.length) {
                ans = nums.length;
                break;
            } else if(nums[ans] < nums[0]) {
                ans = 0;
                break;
            }

            if(target <= nums[mid]) {
                mid = right;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return mid;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, 7));

    }

}
