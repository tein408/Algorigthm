package Programmers.level3;

import java.util.HashMap;
import java.util.Map;

//다단계 칫솔 판매
public class PG77486 {

    Map<String, String> map = new HashMap<>();
    Map<String, Integer> idxMap = new HashMap<>();

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];

        for(int i=0; i<enroll.length; i++) {
            map.put(enroll[i], referral[i]);
            idxMap.put(enroll[i], i);
        }

        for(int i=0; i<seller.length; i++) {
             int currMoney = amount[i] * 100;
             String currPerson = seller[i];
             
            while(!currPerson.equals("-")) {
                int idx = idxMap.get(currPerson);

                //세금
                int ten = currMoney / 10;
                //판매원 금액
                int sellerMon = currMoney - ten;
                answer[idx] += sellerMon;

                currPerson = map.get(currPerson);
                currMoney = ten;

                if(ten < 1)
                    break;
            }
        }

        return answer;
    }

}
