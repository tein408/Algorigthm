package Programmers;

public class PGlotto {

    public int[] solution(int[] lottos, int[] win_nums) {
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
    }

}
