public class LC520 {

    public boolean detectCapitalUse(String word) {
        if(word.length() == 1) {
            return true;
        }

        int n = word.length();
        int lowerCnt = 0, upperCnt = 0;

        for(int i=1; i<n; i++) {
            char curr = word.charAt(i);
            if(curr >= 'a' && curr <= 'z') {
                lowerCnt++;
            } else if(curr >= 'A' && curr <= 'Z') {
                upperCnt++;
            }
        }

        boolean first = false;
        if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            first = true;
        }

        if(lowerCnt == n-1) {
            return true;
        } else if(upperCnt == n-1) {
            return first;
        } else {
            return false;
        }

    }

}
