package leetcode.easy;

public class LC258 {

    public int addDigits(int num) {
        int mod = 0;
        while (num > 0) {
            mod += num % 10;
            num = num / 10;

            if (num == 0 && mod > 9) {
                num = mod;
                mod = 0;
            }
        }
        return mod;
    }

}
