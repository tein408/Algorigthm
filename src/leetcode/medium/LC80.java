package leetcode.medium;

public class LC80 {
    //배열 원소 중복을 최대 두번까지만 허용
    //그 외는 지우고 남은 원소 개수 리턴
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3)
            return nums.length;

        int idx = 2;

        for(int i=2; i<nums.length; i++) {
            if(nums[i] != nums[idx-1] || nums[i] != nums[idx-2])
                nums[idx++] = nums[i];
        }
        return idx;
    }

}
