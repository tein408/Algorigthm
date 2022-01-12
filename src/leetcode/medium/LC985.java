package leetcode.medium;

public class LC985 {

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int m = queries.length;

        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            if(nums[i] % 2 == 0)
                sum += nums[i];
        }

        int[] answer = new int[m];

        for (int i=0; i<m; i++) {
            int index = queries[i][1];

            if (nums[index] % 2 == 0) {
                sum -= nums[index];
            }

            nums[index] += queries[i][0];

            if (nums[index] % 2 == 0) {
                sum += nums[index];
            }

            answer[i] = sum;
        }

        return answer;
    }

}
