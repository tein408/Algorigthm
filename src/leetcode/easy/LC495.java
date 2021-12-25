package leetcode.easy;

public class LC495 {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 0)
            return 0;
        if(timeSeries.length == 1)
            return duration;

        int ans = 0;

        for(int i=1; i<timeSeries.length; i++) {
            ans += Math.min(duration, timeSeries[i] - timeSeries[i-1]);
        }

        ans += duration;

        return ans;
    }

}
