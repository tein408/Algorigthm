package leetcode.easy;

public class LC190 {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for(int i=0; i<32; i++) {
            ans = ans << 1;
            if((n&1) > 0)
                ans = ans | 1;
            n = n >> 1;
        }
        return ans;
    }

}
