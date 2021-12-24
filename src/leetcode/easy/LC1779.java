package leetcode.easy;

public class LC1779 {

    public int nearestValidPoint(int x, int y, int[][] points) {
        int answer = -1;
        int minDistance = Integer.MAX_VALUE;

        for(int i=0; i<points.length; i++) {
            int distanceX = x - points[i][0];
            int distanceY = y - points[i][1];

            if(distanceX == 0 || distanceY == 0) {
                int abs = Math.abs(distanceX + distanceY);
                if(minDistance > abs) {
                    minDistance = abs;
                    answer = i;
                }
            }

        }

        return answer;
    }

}
