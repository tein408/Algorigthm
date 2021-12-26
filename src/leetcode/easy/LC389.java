package leetcode.easy;

public class LC389 {

    public char findTheDifference(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        int[] sf = new int[26];
        int[] tf = new int[26];

        for(char c : a)
            sf[c - 'a']++;

        for(char c : b)
            tf[c - 'a']++;

        char ans = 'a';

        for(int i=0; i<26; i++) {
            if(sf[i] != tf[i]) {
                ans = (char) (i + 'a');
                break;
            }
        }

        return ans;
    }

}
