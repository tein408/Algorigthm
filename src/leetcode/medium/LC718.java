package leetcode.medium;

public class LC718 {

    public int findLength(int[] nums1, int[] nums2) {
        int ans = 0;
        int n = nums1.length;
        int m = nums2.length;

        int[][] memo = new int[n+1][m+1];

        // TC, SC : O(NM)

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {

                if(nums1[i-1] == nums2[j-1]) {
                    memo[i][j] = memo[i-1][j-1] + 1;
                    ans = Math.max(ans, memo[i][j]);
                }

            }
        }

        return ans;
    }

    // Space Complexity : O(N)
    /*
    public int findLength(int[] nums1, int[] nums2) {

        int[] dp = new int[nums2.length+1];
        int res = 0;
        for(int i=0; i<nums1.length; i++) {
            for(int j=nums2.length-1; j>=0; j--) {
                res = Math.max(res, dp[j+1] = nums1[i] == nums2[j] ? dp[j]+1 : 0);
            }
        }
        return res;

    }
     */

}

// 부분 숫자에서 공통된 연속된 숫자의 길이 중 큰 값을 리턴
// 배열의 맨 뒤부터 값 비교
// 만약 두 배열의 값이 같다면 이전 위치의 값이 1을 더한게 현재 값
// > dp[i][j] = dp[i+1][j+1] + 1

// dp는 num1배열의 i번째와 nums2 배열의 j번째 element에서 시작한 공통 subarray 길이로 정의

// 뒤에서부터 하나씩 앞으로 가면서 각 수가 같은지 보는데,
// 현재 값이 같다면 이전의 값에서 1만 더하면 되는 것
// 그래서 dp table에 비교할 때 i와 j값이 만나는 곳에 값을 저장해서 다음으로 실행할 때 가져와서 씀




