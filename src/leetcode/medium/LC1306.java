package leetcode.medium;

public class LC1306 {

    boolean[] visit;

    public boolean canReach(int[] arr, int start) {
        visit = new boolean[arr.length];
        return jump(arr, start);
    }

    boolean jump(int[] arr, int n) {
        if(n >= arr.length || n < 0 || visit[n])
            return false;

        if(arr[n] == 0)
            return true;

        visit[n] = true;

        boolean left = jump(arr, n - arr[n]);
        if(left)
            return true;
        return jump(arr, n + arr[n]);
    }

}
