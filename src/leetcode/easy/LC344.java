package leetcode.easy;

public class LC344 {

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        //char[] c = {'h', 'e', 'l', 'l', 'o'};
        char[] c = {'H','a','n','b','a'};
        reverseString(c);
        for(char cc : c)
            System.out.println(cc);
    }

}
