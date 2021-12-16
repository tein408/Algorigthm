package leetcode.easy;

public class LC414 {

    public static int thirdMax(int[] nums) {
        if(nums.length < 3)
            return nums[nums.length-1];

        long a = Long.MIN_VALUE;
        long b = Long.MIN_VALUE;
        long c = Long.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == a || nums[i] == b || nums[i] == c)
                continue;
            if(a == Long.MIN_VALUE || nums[i] > a ) {
                c = b;
                b = a;
                a = nums[i];
            } else if(b == Long.MIN_VALUE || nums[i] > b) {
                c = b;
                b = nums[i];
            } else if(c == Long.MIN_VALUE || nums[i] > c) {
                c = nums[i];
            }
        }

        return c == Long.MIN_VALUE ? (int) a : (int) c;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,1};
        System.out.println(thirdMax(arr));
    }

}
