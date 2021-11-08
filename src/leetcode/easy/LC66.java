package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class LC66 {

    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();

        for(int i=digits.length-1; i>=0; i--) {
            if(digits[i] == 9 && i==0)
                list.add(1);

            if(digits[i] == 9) {
                digits[i] = 0;
                continue;
            }

            digits[i]++;
            break;
        }

        for(int i=0; i< digits.length; i++) {
            list.add(digits[i]);
        }

        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

}
