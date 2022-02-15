public class LC1013 {

    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;

        for(int i : arr)
            total += i;

        if(total %3 != 0)
            return false;

        int avg = total / 3;
        int sum = 0;
        int cnt = 0;

        for(int i : arr) {
            sum += i;
            if(sum == avg) {
                cnt++;
                sum = 0;
            }
        }

        return cnt >= 3;
    }

}
