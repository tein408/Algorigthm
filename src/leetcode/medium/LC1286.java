package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class LC1286 {

    Queue<String> que = new LinkedList<>();

//    public CombinationIterator(String characters, int combinationLength) {
//        solution(characters, 0, "", combinationLength);
//    }

    public String next() {
        return que.poll();
    }

    public boolean hasNext() {
        return !que.isEmpty();
    }

    void solution(String str, int idx, String subStr, int combinationLength) {
        //base
        //subString length == combinationLength 면 큐에 넣기
        if(subStr.length() == combinationLength) {
            que.offer(subStr);
            return;
        }

        //idx부터 ~ i 위치 옮기면서
        //subString 구하기
        for(int i=idx; i<str.length(); i++) {
            solution(str, i+1, subStr + str.charAt(i), combinationLength);
        }
    }

}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */