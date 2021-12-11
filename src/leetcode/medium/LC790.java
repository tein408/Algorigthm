package leetcode.medium;

public class LC790 {

    public static int numTilings(int n) {
        long mod = 1000000007;
        long[] tile = new long[n+1];

        if(n < 3)
            return n;
        if(n == 3)
            return 5;

        tile[0] = 0;
        tile[1] = 1;
        tile[2] = 2;
        tile[3] = 5;

        for(int i=4; i<=n; i++) {
            tile[i] = ((tile[i-1] * 2) + tile[i-3] * 2 / 2) % mod;
        }

        return (int) tile[n];
    }

    public static void main(String[] args) {
        System.out.println(numTilings(4));
    }

}
