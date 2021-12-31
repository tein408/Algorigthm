package leetcode.medium;

public class LC1201 {

    public int nthUglyNumber(int n, int a, int b, int c) {
        long left = 1;
        long right = Integer.MAX_VALUE;

        while(left < right) {
            long mid = left + (right - left) / 2;
            long cnt = cnt(mid, a, b, c);

            if(cnt < n) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }

        return (int) left;
    }

    long gcd(long x, long y) {
        if(x == 0)
            return y;
        return gcd(y % x, x);
    }

    long lcm(long x, long y) {
        return (x * y) / gcd(x, y);
    }

    long cnt(long n, long a, long b, long c) {
        return ( (n/a + n/b + n/c) )
                - (n / lcm(a,b)) - (n / lcm(a,c)) - (n / lcm(b,c))
                + (n / lcm(a, lcm(b,c)));
    }

}
