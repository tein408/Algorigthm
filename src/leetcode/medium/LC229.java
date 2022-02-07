package leetcode.medium;

import java.util.*;

public class LC229 {
    // Boyer-moore majority Vote algorithm
    // nums.length/3 < count 가 되어야함. double type 비교로
    // TC1 : 3 2 3 / 3
    // TC2 : 1 / 1
    // TC3 : 1 2 1 2 3 / 1 2 // 1 1 2 2 3
    // TC4 : 1 2 1 2 1 3 / 1 // 1 1 1 2 2 3
    // TC5 : 1 2 1 1 4 4 / 1 // 1 1 1 2 4 4
    // TC6 : 1 2 1 1 4 4 4 / 1 4 // 1 1 1 2 4 4 4

    // TC : O(N), SC : O(1)

    // n % 3 => 나올 수 있는 나머지가 0 1 2 세 개.
    // candidate 최대 갯수는 두 개.
    // candidate 두 개의 등장 빈도에 대해 확인.
    // 각 0으로 먼저 초기화 하고
    // 배열을 돌면서 i번째 원소 == candidate 라면 그 cnt 증가
    // cnt == 0 일 때는 각 candidate에 i 번째 원소 저장하면서 cnt=1 해줌.
    // 아니면 cnt 감소.
    // 그렇게 candidate 저장 후 
    // 다시 루프를 새로 돌면서 저장해둔 candidate의 개수 확인
    // 그게 n/3 보다 크면 ans에 저장 후 ans 리턴

    // Follow up 실천
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new LinkedList<>();

        if(nums == null) {
            return list;
        }

        int cnt1 = 0, cnt2 = 0, candidate1 = 0, candidate2 = 0;

        for(int i : nums) {
            if(i == candidate1) {
                cnt1++;
            } else if(i == candidate2) {
                cnt2++;
            } else if(cnt1 == 0) {
                candidate1 = i;
                cnt1 = 1;
            } else if(cnt2 == 0) {
                candidate2 = i;
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = cnt2 = 0;

        for(int i : nums) {
            if(i == candidate1)
                cnt1++;
            else if(i == candidate2)
                cnt2++;
        }

        if(cnt1 > nums.length/3)
            list.add(candidate1);
        if(cnt2 > nums.length/3)
            list.add(candidate2);

        return list;
    }

    // Map을 사용한 풀이
/*    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int i : map.keySet()) {
            if(map.get(i) > nums.length / 3) {
                if(!ans.contains(i))
                    ans.add(i);
            }
        }

        return ans;
    }*/

}

