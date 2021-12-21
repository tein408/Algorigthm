package leetcode.easy;

public class LC859 {

    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length() || s.length() < 2 || goal.length() < 2)
            return false;

        int[] sCnt = new int[26];
        int[] goalCnt = new int[26];

        //두 문자열의 길이가 같고, 등장하는 알파벳의 빈도도 같아야 true 리턴 가능
        //s 길이만큼 돌면서 각 알파벳 빈도 체크
        int cnt = 0;
        for(int i=0; i<s.length(); i++) {
            sCnt[s.charAt(i) - 'a']++;
            goalCnt[goal.charAt(i) - 'a']++;
            //순서대로 탐색하면서 위치가 다른 문자의 개수 확인
            if(s.charAt(i) != goal.charAt(i))
                cnt++;
        }

        if(cnt > 2 || cnt == 1) {
            return false;
        }

        //각 알파벳 빈도 확인
        // ab ab -> cnt == 0, false
        // aa aa -> cnt == 0, s[i] == goal[i], true
        // ab ba -> cnt == 2, s[i] != goal[i], true
        // abc abc -> cnt == 0, false
        // abc abd -> cnt == 1, s[3] != goal[3], false
        // aabc aabc -> cnt == 0, s[i] == goal[i], true
        // aabc aabd -> cnt == 1, s[i] != goal[i], false
        // aabc aacb -> cnt == 2, s[i] == goal[i], true
        for(int i=0; i<26; i++) {
            if(cnt == 0 && sCnt[i] > 1) {
                return true;
            }
            if(sCnt[i] != goalCnt[i]) {
                return false;
            }
        }

        return cnt == 2;
    }

}
