package leetcode.easy;

public class LC1295 {

    //String 변환 후 길이 이용 7ms
/*    public int findNumbers(int[] nums) {
        int cnt = 0;
        for(int i=0; i<nums.length; i++) {
            String temp = nums[i] + "";
            if(temp.length() %2 == 0)
                cnt++;
        }
        return cnt;
    }*/

    //속도 개선
    public int findNumbers(int[] nums) {
        int two = 10;
        int three = 100;
        int four = 1000;
        int five = 10000;
        int six = 100000;
        int cnt = 0;
        for(int i=0; i<nums.length; i++) {
            int temp = nums[i];
            if(temp >= two && temp < three)
                cnt++;
            else if(temp >= four && temp < five)
                cnt++;
            else if(temp == six)
                cnt++;
        }
        return cnt;
    }

}
