package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LC764 {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        //0의 개수 저장
        Set<Integer> set = new HashSet<>();
        for(int[] i : mines) {
            set.add(i[0] * n + i[1]);
        }

        int[][] map = new int[n][n];
        int ans = 0, cnt = 0;

        //각 행마다 왼쪽->오른쪽, 오른쪽->왼쪽으로 열에 0이 있는지 탐색
        // 1 1 0 1 1 <- 5 * 5 가운데 행에 있다면
        // 1 2 3 2 1
        // 1 2 3 2 1
        // 1 1 0 1 1
        // 1 2 3 2 1
        // 1 2 3 2 1
        for(int i=0; i<n; i++) {
            cnt = 0;
            for(int j=0; j<n; j++) {
                cnt = set.contains(i*n + j) ? 0 : cnt + 1;
                map[i][j] = cnt;
            }

            cnt = 0;
            for(int j=n-1; j>=0; j--) {
                cnt = set.contains(i*n + j) ? 0 : cnt + 1;
                map[i][j] = Math.min(map[i][j], cnt);
            }
        }

        //각 열마다 위->아래, 아래->위로 행에 0이 있는지 탐색
        // 1 1 1 1 1
        // 1 2 1 2 1
        // 1 1 0 1 1
        // 1 2 1 2 1
        // 1 1 1 1 1
        for(int i=0; i<n; i++) {
            cnt = 0;
            for(int j=0; j<n; j++) {
                cnt = set.contains(j*n + i) ? 0 : cnt + 1;
                map[j][i] = Math.min(map[j][i], cnt);
            }

            cnt = 0;
            for(int j=n-1; j>=0; j--) {
                cnt = set.contains(j*n + i) ? 0 : cnt + 1;
                map[j][i] = Math.min(map[j][i], cnt);
                ans = Math.max(ans, map[j][i]);
            }
        }

        return ans;
    }


}