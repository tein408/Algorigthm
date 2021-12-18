package leetcode.hard;

public class LC902 {

    public int atMostNGivenDigitSet(String[] digits, int n) {
        int cnt = 0;
        int digit = digits.length;

        //n을 자리수 마다 하나씩 떼어서 int 배열 ns에 저장
        int nLen = String.valueOf(n).length();
        int[] ns = new int[nLen];
        for(int i=nLen-1; i>=0; i--) {
            ns[i] = n%10;
            n /= 10;
        }

        //n 자리수보다 한칸 작은 자리수까지 경우의 수 구하기
        for(int i=1; i<nLen; i++) {
            cnt += Math.pow(digit, i);
        }

        //n과 같은 자리수 중, n을 넘지 않는 경우
        for(int i=0; i<nLen; i++) {
            //n의 각 자리수와 같은지 비교에 사용
            boolean isOver = false;

            for(String s : digits) {
                //digits 원소 하나
                int temp = Integer.parseInt(s);

                //n의 각 자리보다 작을때만 경우의 수 구함
                if(temp < ns[i]) {
                    cnt += Math.pow(digit, nLen - 1 - i);
                }
                if(temp == ns[i]) {
                    //n의 각 자리수와 같은가? -> true
                    isOver = true;
                    break;
                }
                //n의 각 자리의 수보다 클 경우는 지나감.
            }
            //n과 같은지 비교 결과가 true가 아니라면
            //n과 같은 결과가 없다는 것.
            if(!isOver)
                return cnt;
        }

        //n과 같은 경우는 제외하고 구하였으므로,
        //n과 같은 경우가 있을 수 있음 -> +1
        return cnt + 1;
    }


}
