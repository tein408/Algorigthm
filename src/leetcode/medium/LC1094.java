package leetcode.medium;

public class LC1094 {

    public boolean carPooling(int[][] trips, int capacity) {
        // 승객수 관리
        int[] count = new int[1001];

        // 승객이 타는 시간에 승객수 더하고 내리는 시간에 승객수 빼기
        for(int i=0; i<trips.length; i++) {
            count[trips[i][1]] += trips[i][0];
            count[trips[i][2]] -= trips[i][0];
        }

        // 승객수 누적시키는데 capacity보다 크면 false
        int total = 0;
        for(int i=0; i<count.length; i++) {
            total += count[i];
            if(total > capacity) {
                return false;
            }
        }

        return true;
    }

}
