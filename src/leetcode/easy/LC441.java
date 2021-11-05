package leetcode.easy;

public class LC441 {

    public static int arrangeCoins(int n) {
        return find(n);
    }

    static int find(int n) {
        long left = 0;
        long right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            //등차수열 공식 사용
            long val = mid * (mid + 1) / 2;
            if (n < val) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int) right;
    }

}
