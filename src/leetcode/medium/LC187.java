package leetcode.medium;

import java.util.*;

public class LC187 {

    public static List<String> findRepeatedDnaSequences(String s) {
        int left = 0;
        int right;

        List<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        while(true) {
            right = left + 10;
            if(left+10 > s.length())
                break;
            String temp = s.substring(left, right);
            if(set.contains(temp))
                if(!list.contains(temp))
                    list.add(temp);
            set.add(temp);
            left++;
        }
        return list;
    }

    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> res = findRepeatedDnaSequences(s);
        for(String i : res)
            System.out.println(i);
    }


}
