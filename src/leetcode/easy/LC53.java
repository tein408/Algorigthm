package leetcode.easy;

public class LC53 {
    
    //처음 풀이
/*    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int answer = sum;

        if(nums.length == 1) {
            answer = sum;
        } else {
            for(int i=1; i<nums.length; i++) {
                sum += nums[i];
                if(nums[i] > sum)
                    sum = nums[i];
                if(answer < sum)
                    answer = sum;
            }
        }
        return answer;
    }*/

    //개선 1ms, 90.3MB
    public int maxSubArray(int[] nums) {
        if(nums.length < 2)
            return nums[0];

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            sum = nums[i] + sum;
            max = Math.max(max, sum);
            if(sum < 0)
                sum = 0;
        }

        return max;
    }

    //extra space 5ms 92.6MB
/*    public int maxSubArray(int[] nums) {
        if(nums.length < 2)
            return nums[0];

        int max = Integer.MIN_VALUE;
        int[] temp = new int[nums.length];
        temp[0] = nums[0];

        for(int i=1; i<nums.length; i++) {
            temp[i] = Math.max(temp[i-1] + nums[i], nums[i]);
            max = Math.max(temp[i], max);
        }

        return max;
    }*/

}
