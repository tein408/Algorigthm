package leetcode.medium;

public class LC1014 {

    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        int max = Integer.MIN_VALUE;

        // initial value setting
        int leftMax = values[0];

        // values[i] + values[j] + i - j
        // values[i] + i + values[j] - j

        // leftMax : values[i] + i
        // curr : leftMax + values[j] - j

        for (int i=1; i<n; i++) {
            int curr = leftMax + values[i] - i;
            max = Math.max(curr, max);

            int left = values[i] + i;
            leftMax = Math.max(left, leftMax);
        }

        return max;
    }

}
