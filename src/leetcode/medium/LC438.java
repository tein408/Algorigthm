package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class LC438 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(s.length() < p.length())
            return ans;

        int[] sfreq = new int[26];
        for(char c : p.toCharArray())
            sfreq[c - 'a']++;

        int left = 0, right = 0;
        int cnt = 0;
        while(right < s.length()) {
            if(sfreq[s.charAt(right) - 'a'] > 0) {
                sfreq[s.charAt(right++) - 'a']--;
                cnt++;
            }
            else {
                sfreq[s.charAt(left++) - 'a']++;
                cnt--;
            }
            if(cnt == p.length())
                ans.add(left);
        }
        return ans;
    }

}
