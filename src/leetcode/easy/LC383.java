package leetcode.easy;

public class LC383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();
        if(n > m)
            return false;

        int[] cnt = new int[26];
        for(int i=0; i<m; i++) {
            cnt[magazine.charAt(i) - 'a']++;
        }

        for(int i=0; i<n; i++) {
            if(cnt[ransomNote.charAt(i) - 'a'] == 0)
                return false;
            cnt[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }

}
