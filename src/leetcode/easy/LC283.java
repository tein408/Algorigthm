package leetcode.easy;

public class LC283 {
    //문제에서 의도한 two pointer로 풀기
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        for(right = 0; right<nums.length; right++) {
            //right가 0이 아닌 원소 위치를 찾으면
            if(nums[right] != 0) {
                //right와 left의 위치가 다를때
                //(left가 right 보다 오른쪽에 있지 않아야함.)
                if(right != left) {
                    //left에 right 를 담고
                    nums[left] = nums[right];
                    //right에는 0을 담아 0이 아닌 원소를 앞으로 옮긴다.
                    nums[right] = 0;
                }
                //left한칸 옮기기
                left++;
            }
        }

    }

}
