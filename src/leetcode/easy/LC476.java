package leetcode.easy;

public class LC476 {

    public int findComplement(int num) {
        int n = num;
        int shift = 1;
        while (n > 0) {
            n = n >> 1;
            shift = shift << 1;
        }
        return num ^ (shift - 1);
    }

}
