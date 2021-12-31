package leetcode.medium;

public class LC1567 {

    public static int getMaxLen(int[] nums) {
        int maxLen = -1;
        int zeroIdx = -1;
        int firstNegativeIdx = -1;
        int negativeCnt = 0;

        for(int i=0; i<nums.length; i++) {

            // nums[i] == 0 이면
            // 음수위치, 음수 개수 초기화,
            // 0의 위치 저장
            if(nums[i] == 0) {
                zeroIdx = i;
                negativeCnt = 0;
                firstNegativeIdx = -1;
            }

            // nums[i] 가 음수일 때,
            // 음수 등장위치 저장하고
            // 음수 개수++;
            if(nums[i] < 0) {
                negativeCnt++;
                if(firstNegativeIdx == -1)
                    firstNegativeIdx = i;
            }

            // 양수 등장시
            // 등장한 음수 개수 따라 처리
            else {
                // 음수가 짝수개라면 음수의 위치 부터
                if(negativeCnt % 2 == 0) {
                    maxLen = Math.max(maxLen, i - firstNegativeIdx);
                }
                // 음수가 홀수개라면 0이 등장한 위치부터
                else {
                    maxLen = Math.max(maxLen, i - zeroIdx);
                }
           }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] n = {0,1,-2,-3,-4};
        System.out.println(getMaxLen(n));;
    }

}
