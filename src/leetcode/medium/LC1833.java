package leetcode.medium;

import java.util.Arrays;

public class LC1833 {

    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnt = 0;
        for(int i=0; i<costs.length; i++) {
            if(coins >= costs[i]) {
                coins -= costs[i];
                cnt++;
            }
        }
        return cnt;
    }

}
