package leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

public class LC452 {

    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });

        int cnt = 1;
        int prev = points[0][1];

        for(int i=1; i<points.length; i++) {
            int next = points[i][0];

            if(prev >= next) {
                continue;
            }

            cnt++;
            prev = points[i][1];
        }

        return cnt;
    }

}
