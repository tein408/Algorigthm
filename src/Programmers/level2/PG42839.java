package Programmers.level2;

import java.util.HashSet;

//소수찾기
public class PG42839 {

    boolean[] visit;
    HashSet<Integer> set;

    public int solution(String numbers) {
        int len = numbers.length();
        visit = new boolean[len+1];
        set = new HashSet<>();
        int[] num = new int[len];

        for(int i=0; i<len; i++)
            num[i] = numbers.charAt(i) - '0';

        for(int i=0; i<len; i++)
            chk(num, "", i+1, 0);

        return set.size();
    }

    void chk(int[] num, String str, int n, int dep) {
        if(n==dep) {
            int temp = Integer.parseInt(str);
            if(isPrime(temp))
                set.add(temp);
            return;
        }

        for(int i=0; i<num.length; i++) {
            if(!visit[i]) {
                visit[i] = true;
                str = str + num[i];
                chk(num, str, n, dep+1);
                str = str.substring(0, str.length()-1);
                visit[i] = false;
            }
        }
    }

    boolean isPrime(int n) {
        if(n==0 || n==1)
            return false;
        for(int i=2; i<n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
