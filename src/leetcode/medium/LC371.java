package leetcode.medium;

public class LC371 {

    //without using the operators + ans -
    public int getSum(int a, int b) {
        while(b != 0) {
            int c = a & b;
            a = a ^ b;
            b = c << 1;
        }
        return a;
    }
}
