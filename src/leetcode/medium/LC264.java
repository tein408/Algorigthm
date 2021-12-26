package leetcode.medium;

import java.util.Arrays;

public class LC264 {

    public int nthUglyNumber(int n) {
        if(n == 1)
            return 1;

        // 2,3,5단 
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        ans[0] = 1;

        // 2, 3, 5를 몇 번씩 곱했는지 저장할 변수들
        int two = 0, three = 0, five = 0;

        for(int i=1; i<ans.length; i++) {
            int min = Integer.MAX_VALUE;
            // 셋 중에 최소값 구해서 ans[i] 에 순서대로 입력
            min = Math.min( Math.min(ans[two] * 2, ans[three] * 3), ans[five] * 5 );
            ans[i] = min;

            // ans[i]가 2, 3, 5 중 어느 배수인지 구해서
            // 각 곱한 수 ++;
            if(ans[i] == 2 * ans[two])
                two++;
            if(ans[i] == 3 * ans[three])
                three++;
            if(ans[i] == 5 * ans[five])
                five++;

        }

        return ans[n-1];
    }

}
