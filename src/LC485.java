import java.util.ArrayList;

public class LC485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                list.add(1);
                cnt++;
                max = Math.max(max, cnt);
            } else {
                list.clear();
                max = Math.max(max, cnt);
                cnt = 0;
            }
        }
        return cnt;
    }

}