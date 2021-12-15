package leetcode.easy;

public class LC1299 {

    public int[] replaceElements(int[] arr) {
        if(arr.length < 2)
            return new int[] {-1};

        int max = -1;
        for(int i=arr.length-1; i>=0; i--) {
            //현재까지의 최대값 저장
            int currentMax = max;
            //최대값 담음
            max = Math.max(currentMax, arr[i]);
            //arr[i] 에 현재까지의 최대값 저장
            arr[i] = currentMax;
        }

        return arr;
    }

}
