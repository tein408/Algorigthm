package leetcode.medium;

public class LC416 {

    public static boolean canPartition(int[] nums) {
        if(nums.length < 2)
            return false;

        int total = 0;
        for(int i : nums)
            total += i;

        if(total%2 != 0)
            return false;

        total /= 2;
        int[] arr = new int[total+1];
        arr[0] = 1;

        for(int i=1; i<nums.length; i++) {
            for(int j=total; j>=nums[i]; j--) {
                arr[j] += arr[j-nums[i]];
                if(j == total && arr[j] > 0)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1,5,11,5};
        System.out.println(canPartition(a));
    }

}
