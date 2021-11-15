package leetcode.easy;

public class LC191 {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //use brian kernighan's algorithm
        int cnt = 0;
        while(n > 0) {
            n = n & (n-1);
            cnt++;
        }
        return cnt;
    }

    /*
    * n & (n-1) 하면
    * n에서 뒤에서 가장 처음 등장하는 1을 삭제한 결과와 같음.
    * */

/*    public int hammingWeight(int n) {
        int cnt = 0;
        for(int i=0; i<32; i++) {
            cnt += n & 1;
            n = n >> 1;
        }
        return cnt;
    }*/

}
