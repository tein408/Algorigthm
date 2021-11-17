package leetcode.medium;

public class LC567 {
    //3ms submission
    //https://www.codetd.com/en/article/12571052
/*    public boolean checkInclusion(String s1, String s2) {
        int len = s1.length();
        int n = s2.length();
        int delta = 0;

        if(n < len)
            return false;

        int[] ch = new int[26];
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        for(char c : c1) {
            if(ch[c - 'a']++ == 0)
                delta++;
        }

        for(int i = 0; i < len; i++) {
            switch(ch[c2[i] - 'a']--) {
                case 0:
                    delta++;
                    break;
                case 1:
                    delta--;
                    break;
            }
        }

        if(delta == 0)
            return true;

        for(int i = len; i < n; i++) {
            switch(ch[c2[i] - 'a']--) {
                case 0:
                    delta++;
                    break;
                case 1:
                    delta--;
                    break;
            }
            switch(ch[c2[i - len] - 'a']++) {
                case 0:
                    delta++;
                    break;
                case -1:
                    delta--;
                    break;
            }
            if(delta == 0)
                return true;
        }
        return false;
    }*/

    //2ms submission
    //leetcode submit example
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
            return false;

        char[] s1freq = new char[26];
        char[] s2freq = new char[26];

        char[] s1Char = s1.toCharArray();
        char[] s2Char = s2.toCharArray();

        //s1의 각 문자 빈도 저장
        for(char c : s1Char)
            s1freq[c - 'a']++;

        int start = 0, end = 0;

        //s2 각 문자 빈도를 s2문자열에서 s1의 길이만큼 저장
        while(end < s1.length())
            s2freq[s2Char[end++] - 'a']++;

        //각 알파벳 빈도가 같다면 true
        if(freqSame(s1freq, s2freq))
            return true;

        //그렇지 않다면
        //s2의 남은 길이만큼 s2의 남은 문자들 빈도 비교
        while(end < s2.length()) {
            s2freq[s2Char[start++] - 'a']--;
            s2freq[s2Char[end++] - 'a']++;
            if(freqSame(s1freq, s2freq))
                return true;
        }
        return false;
    }

    public boolean freqSame(char[] a, char[] b) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i])
                return false;
        }
        return true;
    }

}
