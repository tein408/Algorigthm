package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class LC202 {

    public boolean isHappy(int n) {
        if(n == 1)
            return true;

        Set<Integer> set = new HashSet<>();

        int mod = 0, sq = 0;

        while(true) {
            set.add(n);
            sq = 0;
            while(n > 0) {
                mod = n % 10;
                sq += mod * mod;
                n /= 10;
            }
            if(sq == 1) {
                return true;
            }
            else {
                n = sq;
            }
            if(set.contains(n))
                break;
        }
        return false;
    }

}
