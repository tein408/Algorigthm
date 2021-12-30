package leetcode.medium;

public class LC1015 {

    public int smallestRepunitDivByK(int k) {
        int remainder = 0;

        for(int i=1; i<=k; i++) {
            int n = remainder * 10 + 1;
            remainder = n % k;
            if(remainder == 0)
                return i;
        }
        return -1;
    }

}
