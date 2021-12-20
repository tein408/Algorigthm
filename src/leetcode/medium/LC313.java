package leetcode.medium;

public class LC313 {

    public int nthSuperUglyNumber(int n, int[] primes) {
        if(n < 2)
            return n;

        //dp[]의 현재 위치 저장
        int[] idx = new int[primes.length];
        int[] dp = new int[n+1];
        dp[0] = 1;

        // primes[i] * primes[i]
        // primes[i] * primes[i-1], primes[i] * primes[i-2], ... , primes[i] * primes[0]

        for(int i=1; i<n; i++) {
            int min = Integer.MAX_VALUE;

            //dp[idx[i]] * prime[i] 최소값 입력
            for(int j=0; j<primes.length; j++) {
                min = Math.min(min, primes[j] * dp[idx[j]]);
                dp[i] = min;
            }

            System.out.println("=========");

            //idx에 matrix 각 원소를 몇번까지 곱했는지 업데이트
            // ex) 7*2가 dp에 있다면 idx[1] = 2; 가 되도록
            for(int j=0; j<primes.length; j++) {
                int temp = dp[idx[j]] * primes[j];
                if(dp[i] == temp) {
                    idx[j]++;
                }
            }
        }

        return dp[n-1];
    }

}
