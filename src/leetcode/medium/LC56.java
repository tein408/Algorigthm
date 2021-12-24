package leetcode.medium;

import java.util.*;

public class LC56 {

    public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        if(n < 2) {
            return intervals;
        }

        List<int[]> list = new ArrayList<>();

        //람다식
        //Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });

        int[] curr = intervals[0];
        list.add(curr);

        for(int i=0; i<n; i++) {
            int[] next = intervals[i];

            if(curr[1] >= next[0]) {
                curr[1] = Math.max(curr[1], next[1]);
            } else {
                curr = next;
                list.add(curr);
            }
        }

        return list.toArray(new int[list.size()][2]);
    }

}
