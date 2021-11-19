package leetcode.easy;

public class LC461 {

    public static int hammingDistance(int x, int y) {
        int a = x^y;
        //bitCount : 1이 포함된 비트의 갯수 카운트
        return Integer.bitCount(a);
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(2,5));
    }

}
