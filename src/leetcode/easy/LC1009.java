package leetcode.easy;

public class LC1009 {

    public int bitwiseComplement(int n) {
        if(n == 0)
            return 1;

        int a = n;
        int shift = 1;
        while (a > 0) {
            a = a >> 1;
            shift = shift << 1;
        }
        return n ^ (shift - 1);
    }

}
