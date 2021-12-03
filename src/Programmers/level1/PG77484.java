package Programmers.level1;

import java.util.HashSet;
import java.util.Set;

//로또의 최고 순위와 최저 순위
public class PG77484 {

/*    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0, min = 0;
        int[] score = {6,6,5,4,3,2,1};

        for(int i=0; i<lottos.length; i++){

            if(lottos[i] == 0) {
                zero++;
                continue;
            }

            for(int j=0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j]) {
                    min++;
                    break;
                }
            }

        }

        int[] answer = new int[2];
        answer[0] = score[zero+min];
        answer[1] = score[min];

        return answer;
    }*/

    //Set 을 이용한 풀이
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> set = new HashSet<>();
        int zeroCnt = 0, correct = 0;

        for(int i=0; i<6; i++) {
            if(lottos[i] == 0) {
                zeroCnt++;
            }
            set.add(lottos[i]);
        }

        if(zeroCnt == 6) {
            return new int[] {1, 6};
        }

        for(int i=0; i<6; i++) {
            if(set.contains(win_nums[i]))
                correct++;
        }

        int max = 7-correct-zeroCnt;
        int min = 7-correct;

        if(max > 6) max = 6;
        if(min > 6) min = 6;

        return new int[]{max, min};
    }

}
