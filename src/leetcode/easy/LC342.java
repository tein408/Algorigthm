package leetcode.easy;

public class LC342 {

    //loop이용
/*    public boolean isPowerOfFour(int n) {
        if(n == 0)
            return false;
        while(n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }*/

    public boolean isPowerOfFour(int n) {
        if(n <= 0 || n == 2 || n ==3)
            return false;
        int and = n & (n-1);
        int three = (n-1) % 3;
        return and == 0 && three == 0;
    }

}
