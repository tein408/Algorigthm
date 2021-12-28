package leetcode.medium;

public class LC215 {

    //공간복잡도 stack frame 사용 -> log N

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return select(nums, 0, n-1, n - k);
    }

    int select(int[] nums, int left, int right, int k) {
        //base
        if(left == right)
            return nums[left];

        int pivot = partition(nums, left, right);

        //만약 내가 정한 pivot이 k번째면 return nums[k]
        if(pivot == k)
            return nums[k];
        //아니면 왼쪽 part
        else if(k < pivot)
            return select(nums, left, pivot - 1, k);
        //아니면 오른쪽 part
        else
            return select(nums, pivot + 1, right, k);
    }

    int partition(int[] nums, int left, int right) {
        //pivot index 정하기
        int mid = left + (right - left) / 2;
        int pivot = nums[mid];

        //왼쪽 기준 저장
        int idx = left;

        //mid와 오른쪽을 바꿈
        swap(nums, mid, right);

        //왼쪽(작은것)부터 오른쪽(큰것)까지 돌면서 pivot보다 작은걸 왼쪽으로 옮긴다
        for(int i=left; i<=right; i++) {
            if(nums[i] < pivot) {
                swap(nums, idx, i);
                idx++;
            }
        }

        //right에 pivot이 저장되어 있으므로
        //마지막으로 idx를 맨 오른쪽으로 옮긴다
        swap(nums, idx, right);

        return idx;
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
