package leetcode.easy;

public class LC136 {

    public int singleNumber(int[] nums) {
        int[] cnt = new int[60001];
        for(int i=0; i<nums.length; i++) {
            cnt[nums[i]+30000]++;
        }

        int ans = 0;
        for(int i=0; i<cnt.length; i++) {
            if(cnt[i] == 1)
                ans = i - 30000;
        }
        return ans;
    }

}
