package leetcode.easy;

public class LC374 {

    public int guessNumber(int n) {
        int left = 1, right = n;
        while(left <= right) {
            int mid = left + (right - left) / 2;
//            int temp = guess(mid);
//            if(temp == 0)
//                return mid;
//            else if(temp < 0)
//                right = mid - 1;
//            else
//                left = mid + 1;
        }
        return -1;
    }
}
