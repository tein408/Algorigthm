package leetcode.easy;

public class LC231 {

    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        if(n == 1)
            return true;

        return n%2==0 && isPowerOfTwo(n/2);
    }

    //비트 연산자를 이용한 풀이
/*    boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        return ((n & (n-1)) == 0);
    }*/

    /*
    * 입력 받은 정수 값 == 2의 거듭제곱
    * ==> 한자리 제외한 나머지 값은 0
    * n = 8
    * n -> 1000
    * n-1 -> 0111
    * n & n-1 -> 0000
    * */

}
