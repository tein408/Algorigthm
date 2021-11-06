package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LC260 {
    
    //직관적인 코드
/*    public static int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int[] ans = new int[2];
        int idx = 0;

        for(int i=0; i<nums.length; i++) {
            if(map.get(nums[i]) == 1) {
                ans[idx] = nums[i];
                idx++;
            }
        }
        return ans;
    }*/

    //문제에서 요구한대로 풀기
    public static int[] singleNumber(int[] nums) {
        int xor = 0;
        //한개씩만 저장된 원소들의 ^ 연산을 저장
        for(int i : nums) {
            xor ^= i;
        }

        //xor을 음수로 표현할 때,
        //비트를 반전시키고(0 -> 1, 1 -> 0) 거기에 +1 하여 저장되는데,
        //xor & -xor 하면
        //a와 b 둘 중 하나의 숫자에 속하는 비트 중 가장 오른쪽에 위치한 1을 찾을 수 있다.
        //가장 오른쪽에 있는 0은 다른 숫자에 속하고,
        //이는 배열을 a와 b가 속한 두 그룹으로 나누기 위함이다.
        int bit = xor & -xor;
        int a = 0, b = 0;

        System.out.println("xor = " + xor);
        System.out.println("bit = " + bit);

        //그래서 각 원소들에 대해 bit와 & 연산 수행 후의 결과로 나누어
        //각 원소들과 ^ 연산결과를 저장하면 된다.
        for(int i : nums) {
            if((i & bit) == 0)
                a ^= i;
            else
                b ^= i;
        }

        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5,5,8};
        int[] res = singleNumber(nums);
        for(int i:res) System.out.println(i);

    }

}
