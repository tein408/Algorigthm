package leetcode.medium;

public class LC540 {

    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;    //홀수
        int mid;

        while(left < right) {
            //처음엔 홀수
            mid = left + (right - left) / 2;

            //짝수
            if(mid % 2 == 0) {
                //같으면 홀수에서 탐색
                //mid보다 오른쪽
                if(nums[mid] == nums[mid+1])
                    left = mid + 2;
                else
                    right = mid;
            }
            //홀수
            else {
                //같으면 짝수에서 탐색
                //mid보다 왼쪽
                if(nums[mid] == nums[mid+1])
                    right = mid - 1;
                else
                    left = mid + 1;
            }

        }

        return nums[left];
    }

}
