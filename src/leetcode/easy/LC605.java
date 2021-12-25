package leetcode.easy;

public class LC605 {

/*    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //심을게 없으면 return true;
        if(n <= 0)
            return true;

        for(int i=0; i<flowerbed.length; i++) {
            //심어진게 1일 때
            if(flowerbed[i] == 1) {
                // i>0 이고 앞 칸에도 심어졌다면 n++
                if(i > 0 && flowerbed[i-1] == 1)
                    n++;
            } else {
                // 빈칸이고
                // 첫칸이거나
                // i>0 일때 앞 칸이 비어있으면
                // n-- 해주고 그 칸은 심은걸로 표시
                if(i == 0 || i > 0 && flowerbed[i-1] == 0) {
                    n--;
                    flowerbed[i] = 1;
                }
            }
            // 다 심었고, i 도 맨 끝에 도달했거나 다음칸이 비었으면
            // return true;
            if(n == 0 && (i == flowerbed.length - 1 || flowerbed[i+1] == 0))
                return true;
        }

        return false;
    }*/

    // 더 간결한 코드
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0, cnt = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0
                    && (i == 0 || flowerbed[i - 1] == 0)
                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                cnt++;
            }
            i++;
        }
        return cnt >= n;
    }

}
