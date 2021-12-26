package leetcode.easy;

public class LC415 {

    public String addStrings(String num1, String num2) {
        int a = num1.length() - 1;
        int b = num2.length() - 1;
        
        StringBuilder sb = new StringBuilder();
        
        int carry = 0;
        
        while(a >= 0 || b >= 0 || carry > 0) {
            int n = 0;
            int m = 0;

            //뒤쪽에서부터 구하기
            if(a >= 0) {
                n = num1.charAt(a) - '0';
                a--;
            }
            if(b >= 0) {
                m = num2.charAt(b) - '0';
                b--;
            }
            
            //일의 자리 구하고
            int sum = (n + m + carry) % 10;
            //십의 자리 구하기
            carry = (n + m + carry) >= 10 ? 1 : 0;
            //한칸씩 추가
            sb.append(sum);
        }

        //뒤집어서 return
        return sb.reverse().toString();
    }

}
