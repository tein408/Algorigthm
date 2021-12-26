package leetcode.easy;

public class LC338 {

    //내장 함수 사용
/*    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        for(int i=1; i<=n; i++) {
            ans[i] = Integer.bitCount(i);
        }

        return ans;
    }*/

    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        for(int i=1; i<=n; i++) {
            ans[i] = (i%2) + ans[i/2];
        }

        return ans;
    }

}
