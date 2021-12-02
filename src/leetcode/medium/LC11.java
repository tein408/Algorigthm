package leetcode.medium;

public class LC11 {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int answer = Integer.MIN_VALUE;

        while(left < right) {
            int width = right - left;
            int high = Math.min(height[left], height[right]);
            answer = Math.max(answer, width*high);
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return answer;
    }

}
