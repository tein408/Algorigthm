package leetcode.easy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LC989 {

    //처음 풀이
/*    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new LinkedList<>();

        int i = num.length - 1;
        int carry = 0;
        while(i >= 0 || k > 0) {

            int n = 0;
            int m = 0;

            if(i >= 0) {
                n = num[i];
                i--;
            }
            if(k > 0) {
                m = k%10;
                k /= 10;
            }

            int sum = (n + m + carry) % 10;
            carry =  (n + m + carry) >= 10 ? 1 : 0;
            list.add(sum);

        }

        if(carry > 0)
            list.add(carry);

        Collections.reverse(list);
        return list;
    }*/

    //코드 개선
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new LinkedList<>();
        int i = num.length - 1;

        while(i >= 0 || k > 0) {
            if(i >= 0) {
                k += num[i];
                i--;
            }
            list.add(k % 10);
            k /= 10;
        }

        Collections.reverse(list);
        return list;
    }

}
