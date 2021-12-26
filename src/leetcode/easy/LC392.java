package leetcode.easy;

public class LC392 {

    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0)
            return true;
        if(s.length() > t.length())
            return false;

        int cnt = 0;

        // acb, ahbgdc -> false
        for(int i=0; i<s.length(); i++) {
            char temp = s.charAt(i);

            //t에서 cnt위치부터 temp를 찾고, 그 위치 반환
            cnt = t.indexOf(temp, cnt);
            if(cnt == -1)
                return false;
            cnt++;
        }

        return true;
    }

}
