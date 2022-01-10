package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC368 {
    //O(N^2)
    //O(N)

    // 1 2 4 8
    // 가장 긴 subset 길이 : 4
    // index = 1 => 1
    // 2 => 1,2
    // 4 => 1,2,4
    // 8 => 1,2,4,8

    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if(nums.length == 0) {
            ans.add(nums[0]);
            return ans;
        }

        Arrays.sort(nums);
        int n = nums.length;

        //nums[i] 에서 얻을 수 있는 가장 큰 subset 길이 저장
        int[] arr = new int[nums.length];

        //arr[i](가장 큰 최대 길이 subset가지는 길이)에서 이전 요소의 위치 저장할 배열
        int[] preIdx = new int[nums.length];

        //largest subset의 끝 요소 인덱스 값 저장
        int maxIdx = 0;

        Arrays.fill(arr, 1);
        Arrays.fill(preIdx, -1);

        // i > j 일 때, nums[i] % nums[j] == 0 성립할 수 있음
        // i < j 일 때, nums[i] % nums[j] != 0

        // 1 2 3 4 5 7 10
        // 1 2 2 3 2 2 3

        for(int i=1; i<n; i++) {
            for(int j=0; j<i; j++) {
                // 문제에서 구하고자 하는 조건 만족한다면
                if(nums[i] % nums[j] == 0) {
                    // 앞서 구해둔 최대 길이 보다 dp[j] + 1이 더 크면 교체
                    if(arr[j]+1 > arr[i]) {
                        arr[i] = arr[j] + 1;
                        // 이전 요소 위치 update
                        preIdx[i] = j;
                    }
                }
            }
            //subset 끝 요소 index update
            if(arr[i] > arr[maxIdx])
                maxIdx = i;
        }

        while(maxIdx != -1) {
            ans.add(nums[maxIdx]);
            maxIdx = preIdx[maxIdx];
        }

        return ans;
    }

}
