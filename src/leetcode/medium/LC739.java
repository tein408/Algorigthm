package leetcode.medium;

public class LC739 {

    public int[] dailyTemperatures(int[] temperatures) {
        int val = temperatures[0];
        int cnt = 0;
        int[] ans = new int[temperatures.length];
        for(int i=1; i<temperatures.length; i++) {
            cnt++;
            if(val < temperatures[i]) {
                ans[i-1] = cnt;
                cnt = 0;
            } else {
                int idx = 1;
                for(int j=i; j<temperatures.length; j++) {
                    if(val >= temperatures[j]) {
                        idx++;
                    }
                    if(val < temperatures[j]) {
                        break;
                    }
                }
                if(idx+i > temperatures.length)
                    idx = 0;
                cnt = 0;
                ans[i-1] = idx;
            }
            val = temperatures[i];
        }
        return ans;
    }

}
