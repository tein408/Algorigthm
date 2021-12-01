package Programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PGOpenChat {

    public static String[] solution(String[] record) {

        int len = 0;
        Map<String, String> nicks = new HashMap<>();

        for(int i=0; i<record.length; i++) {
            String msg = record[i].split(" ")[0];
            if(msg.equals("Enter") || msg.equals("Change")) {
                nicks.put(record[i].split(" ")[1], record[i].split(" ")[2]);
            }
        }

        ArrayList<String> arr = new ArrayList<>();

        for(int i=0; i<record.length; i++) {
            String msg = record[i].split(" ")[0];
            String uid = record[i].split(" ")[1];

            if(msg.equals("Enter")) {
                arr.add(nicks.get(uid) + "님이 들어왔습니다.");
            } else if(msg.equals("Leave")) {
                arr.add(nicks.get(uid) + "님이 나갔습니다.");
            }
        }

        String[] answer = new String[arr.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}

