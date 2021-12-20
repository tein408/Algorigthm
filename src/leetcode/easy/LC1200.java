package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1200 {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for(int i=1; i<arr.length; i++) {
            min = Math.min(min, arr[i] - arr[i-1]);
        }

        for(int i=1; i<arr.length; i++) {
            int temp = Math.abs(arr[i] - arr[i-1]);
            if(temp == min) {
                ans.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }

        return ans;
    }


}

