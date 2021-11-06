package leetcode.medium;

import java.util.HashMap;

public class LC3 {

    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len <= 1)
            return len;

        HashMap<Character, Integer> map = new HashMap<>();
        int idx = 0;
        int maxLen = 0;

        //특정 문자부터 그 문자가 다시 등장할때까지의 최대 길이 계산
        for(int i=0; i<len; i++) {
            char temp = s.charAt(i);
            //문자가 이미 map에 있다면
            if(map.containsKey(temp)) {
                //map에 저장된 문자의 위치와 idx 비교하여 
                //큰 값을 idx에 저장
                idx = Math.max(idx, map.get(temp) + 1);
            }
            //문자와 그 위치 저장
            map.put(temp, i);
            //현재 위치 - idx + 1하면 최대 길이
            maxLen = Math.max(maxLen, i-idx + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

}
