package leetcode.easy;

public class LC1929 {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length * 2;
        int[] ans = new int[n];

        int idx = 0;
        for(int i=0; i<n; i++) {
            ans[i] = nums[idx++];
            if(idx == nums.length)
                idx = 0;
        }
        return ans;
    }

}
