package leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

public class LC435 {

    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        int cnt = 1;

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });

        //[[1,100],[11,22],[1,11],[2,12]]
        //[1,11],[1,100],[2,12],[11,22]

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1; i<n; i++) {
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if(end <= nextStart) {
                end = nextEnd;
            } else {
                cnt++;
            }
        }
        return cnt;
    }

}
