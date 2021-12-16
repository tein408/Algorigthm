package leetcode.easy;

public class LC367 {

    public boolean isPerfectSquare(int num) {
        long left = 1, right = num;
        while(left < right) {
            long mid = left + (right - left) / 2;
            long temp = mid * mid;
            if(temp == num)
                return true;
            else if(temp > num)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }

}
