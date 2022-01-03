package leetcode.easy;

public class LC997 {

    public int findJudge(int n, int[][] trust) {
        // edge case
        // n == 0 아무도 없음
        if(n == 0)
            return -1;
        // n == 1 신뢰 받는 사람이 한명, 즉 판사
        if(n == 1)
            return 1;

        int ans = -1;
        // 마을 사람 수 만큼 배열 생성
        // 사람 번호가 1부터니까 +1 해줌.
        int[] town = new int[n+1];

        // 마을 사람 총 n 명 존재
        // -> 판사 1명, 일반인 n - 1 명
        // trust[i][0] --trust--> trust[i][1]
        // 일반인이     신뢰 보냄   판사에게

        for(int i=0; i<trust.length; i++) {
            //신뢰를 보내면 --
            //신뢰를 받으면 ++
            town[trust[i][0]]--;
            town[trust[i][1]]++;
        }

        for(int i=1; i<=n; i++) {
            //받은 신뢰 수가 n-1과 같다면 정답
            if(town[i] == n-1) {
                return i;
            }
        }

        return ans;
    }

}
