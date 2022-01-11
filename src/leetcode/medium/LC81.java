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




/*    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = -1;
        while(start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                return true;
            }
            //If we know for sure right side is sorted or left side is unsorted
            //오른쪽이 정렬되어 있거나 왼쪽이 정렬되지 않은 경우
            if (nums[mid] < nums[end] || nums[mid] < nums[start]) {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
            //If we know for sure left side is sorted or right side is unsorted
            //왼쪽이 정렬되어 있거나 오른쪽이 정렬되지 않은 경우
            else if (nums[mid] > nums[start] || nums[mid] > nums[end]) {
                if (target < nums[mid] && target >= nums[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
        //If we get here, that means nums[start] == nums[mid] == nums[end], then shifting out
        //any of the two sides won't change the result but can help remove duplicate from
        //consideration, here we just use end-- but left++ works too

        //위쪽에서 걸리지 않으면 왼쪽==중간==오른쪽이 같다는 말이고
        //left 나 right 에서 같은 값이 반복되고 있다는 것이 됨.
        //left++ 나 right-- 하여 중복 되는 부분 줄이기
            } else {
                end--;
            }
        }

        return false;
    }*/

