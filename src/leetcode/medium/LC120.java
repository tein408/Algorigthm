package leetcode.medium;

import java.util.List;

public class LC120 {

    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();

        if(size == 0)
            return 0;

        int[] dp = new int[size+1];

        for(int i=size-1; i>=0; i--) {
            List<Integer> temp = triangle.get(i);
            for(int j=0; j<temp.size(); j++) {
                dp[j] = Math.min(dp[j+1], dp[j]) + temp.get(j);
            }
        }

        return dp[0];
    }

}
