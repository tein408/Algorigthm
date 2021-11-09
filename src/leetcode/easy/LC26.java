package leetcode.easy;

public class LC26 {
    //내장 함수 사용
/*    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }*/

    //내장 함수 사용하지 않고 구현
    public int mySqrt(int x) {
        if(x == 1)
            return 1;

        int left = 1;
        int right = x/2;
        while(left <= right) {
            long mid = left + (right - left) / 2;
            long sq = mid * mid;
            if(x == sq)
                return (int) mid;
            else if(sq < x)
                left = (int) mid + 1;
            else
                right = (int) mid - 1;
        }

        return right;
    }

}
