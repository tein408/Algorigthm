package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class LC131 {
    List<List<String>> ans;

    public List<List<String>> partition(String s) {
        ans = new ArrayList<>();
        search(0, s, new ArrayList<String>());

        return ans;
    }

    boolean isPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }

    void search(int left, String s, List<String> list) {
        if(left >= s.length()) {
            ans.add(new ArrayList<>(list));
        }

        for(int i=left; i<s.length(); i++) {
            if(isPalindrome(s, left, i)) {
                list.add(s.substring(left, i+1));
                search(i+1, s, list);
                list.remove(list.size() - 1);
            }
        }

    }

}
