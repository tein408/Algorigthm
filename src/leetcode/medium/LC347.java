package leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC347 {

    Map<Integer, Integer> map = new HashMap<>();

    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length < 2 || nums == null)
            return nums;

        //nums의 종류만큼 저장
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        //map크기만큼 배열 만들고 배열에 nums의 원소를 unique하게 저장
        int[] arr = new int[map.size()];
        int idx = 0;
        for(int i : map.keySet()) {
            arr[idx++] = i;
        }

        int n = arr.length;
        select(arr, 0, n-1, n - k);

        return Arrays.copyOfRange(arr, n-k, n);
    }

    void select(int[] nums, int left, int right, int target) {
        if(left >= right)
            return;

        int pivot = partition(nums, left, right);

        if(pivot+1 == target)
            return;
        else if(pivot+1 < target)
            select(nums, pivot + 1, right, target);
        else
            select(nums, left, pivot - 1, target);
    }

    int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int pIndex = left;
        for(int i=left; i<right; i++) {
            if(map.get(nums[i]) <= map.get(pivot)) {
                swap(nums, i, pIndex);
                pIndex++;
            }
        }
        swap(nums, pIndex, right);
        return pIndex;
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
