package leetcode.easy;

public class LC121 {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int sum = 0, idx = 0;

        for(int i=0; i<prices.length; i++) {
            if(min > prices[i]) {
                min = prices[i];
                idx = i;
            }
            if(prices[i] > min && idx < i)
                sum = Math.max(sum, prices[i] - min);
        }
        return sum;
    }

}
