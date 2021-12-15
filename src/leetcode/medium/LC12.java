package leetcode.medium;

public class LC12 {

    public String intToRoman(int num) {
        String ans = "";

        //1000~3000
        String[] m = {"", "M", "MM", "MMM"};
        //100~900
        String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        //10~90
        String[] x = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        //1~9
        String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        ans = m[num/1000] + c[ (num%1000)/100 ] + x[ (num%100)/10 ] + i[num%10];

        return ans;
    }

}
