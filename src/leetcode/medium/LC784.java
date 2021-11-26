package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class LC784 {

    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        char[] arr = s.toCharArray();
        solv(ans, arr, 0);
        return ans;
    }

    void solv(List<String> ans, char[] arr, int idx) {
        if(idx == arr.length) {
            ans.add(new String(arr));
            return;
        }
        char temp = arr[idx];
        if((temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z')) {
            arr[idx] = Character.toLowerCase(temp);
            solv(ans, arr, idx+1);
            arr[idx] = Character.toUpperCase(temp);
            solv(ans, arr, idx+1);
        }
        else {
            solv(ans, arr, idx+1);
        }
    }

}
