package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1072 {
    static long x, y, z;
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        long z = y * 100 / x;
        //https://www.acmicpc.net/board/view/53623
        //-> (100*y)/x는 이 문제에서 최대 10^11이고,
        //그 범위의 정수는 부동소숫점이 정확하게 나타낼 수 있음
        //하지만 그 범위에 있는 유한소수를 꼭 정확하게 나타낼 수 있는 건 아님
        //그래서 y/x에는 오차가 생길 수 있고,
        //이미 오차가 생긴 수에 100을 곱해도 오차는 사라지지 않음

        if(z >= 99)
            System.out.println(-1);
        else {
            find(x, y, z);
        }

    }

    static void find(long x, long y, long target) {
        long mid = 0, rate = 0;
        // low 가 1부터 시작해서 최초로 z 값을 넘는 지점(최솟값)을 구해야하므로
        // low = 1;
        // mid가 최소 게임 횟수이므로 rate = (y + mid) * 100 / (x + mid);
        long low = 1;
        long high = x;

        while(low <= high) {
            mid = (high + low) / 2;
            rate = (y + mid) * 100 / (x + mid);
            if(rate > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(low);
    }

}
