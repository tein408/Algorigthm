package leetcode.medium;

public class LC81 {

    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return true;
            } else if(nums[left] == target) {
                return true;
            } else if(nums[right] == target) {
                return true;
            }

            // 왼쪽이 정렬
            if(nums[left] < nums[mid]) {
                // 그 범위에 없음
                if(target < nums[left] || nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else if(nums[mid] < nums[right]) {
                // 오른쪽이 정렬
                // 그 범위에 없음
                if(target < nums[mid] || nums[right] < target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // 범위 줄이기
                // worst case : target 1, nums 00000000
                left++;
                right--;
            }

        }

        return false;
    }

    // 다른 풀이
/*    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return true;
            }

            // 중복되는 범위 줄이기
            while(left < mid && nums[mid] == nums[left]) {
                left++;
            }
            while (mid < right && nums[mid] == nums[right]) {
                right--;
            }

            if(nums[left] <= nums[mid]) {
                if(nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if(nums[mid + 1] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }

        return false;
    }*/

}

