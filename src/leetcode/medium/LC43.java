package leetcode.medium;

public class LC43 {
    public static String multiply(String num1, String num2) {

        if(num1.equals("0") || num2.equals("0"))
            return "0";

        int[] arr1 = new int[num1.length()];
        int[] arr2 = new int[num2.length()];
        int[] res = new int[(num1.length() + num2.length() + 1)];
        StringBuffer sb = new StringBuffer();
        String ans = "";

        int len1 = num1.length();
        int len2 = num2.length();

        for(int i=0; i<len1; i++) {
            arr1[i] = num1.charAt(len1 - 1 - i) - '0';
        }

        for(int i=0; i<len2; i++) {
            arr2[i] = num2.charAt(len2 - 1 - i) - '0';
        }

        for(int i=0; i<len1; i++) {
            for(int j=0; j<len2; j++) {
                res[i+j] += (arr1[i] * arr2[j]);
                int aboveTen = res[i+j] / 10;
                res[i+j] %= 10;
                res[i+j+1] += aboveTen;
            }
        }

        int isZero = len1 + len2 - 1;
        while(res[isZero] == 0) {
            isZero--;
        }
        for(int i=isZero; i>=0; i--) {
            sb.append(res[i]);
        }

        ans = sb.toString();

        return ans;
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        System.out.println(multiply(num1, num2));
        //multiply(num1,num2);
    }

}
