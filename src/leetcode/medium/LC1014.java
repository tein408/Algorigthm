package leetcode.medium;

public class LC1014 {

    public int maxScoreSightseeingPair(int[] values) {
        // edge case : values.length == 2
        if (values.length == 2)
            return values[0] + values[1] - 1;

        // Time Complexity : O(N)
        // Space Complexity : O(1)

//         int result = 0;
//         int prev = values[0];

//         // values[i] + values[j] + i - j
//         // values[i] + i + values[j] - j

//         for(int i=1; i<values.length; i++) {
//             result = Math.max(result, prev + values[i] - i);
//             prev = Math.max(prev, values[i] + i);
//         }

        int result = 0;
        int prev = 0;

        // prev = values[0] + 0;
        // prev = Math.max(prev, values[i] + i);
        // i == 1, values[1] + 1;
        // i == 2, values[2] + 2;
        // ...

        for (int curr : values) {
            result = Math.max(result, prev + curr);
            prev = Math.max(prev, curr) - 1;
        }

        return result;
    }
}

