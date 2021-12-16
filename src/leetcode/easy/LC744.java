package leetcode.easy;

import java.util.Arrays;

public class LC744 {

    public char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);

        int left = 0, right = letters.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(letters[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left < letters.length ? letters[left] : letters[0];
    }

}
