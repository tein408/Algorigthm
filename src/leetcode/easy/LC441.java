package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class LC441 {

    public static int arrangeCoins(int n) {
        List<Long> list = new ArrayList<>();

        list.add(1L);

        for(int i=1; i<n; i++) {
            long next = list.get(i-1) + i+1;
            if(list.get(i-1) < Integer.MAX_VALUE) {
                list.add(next);
            } else {
                break;
            }
        }

        return find(list, n);
    }

    static int find(List<Long> list, int n) {
        int left = 0;
        int right = list.size()-1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (n < list.get(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

}
