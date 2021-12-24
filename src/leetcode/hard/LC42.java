package leetcode.hard;

public class LC42 {

    public int trap(int[] height) {
        // height 의 index 저장
        int left = 0, right = height.length-1;
        // 각 index에서 가질 수 있는 최대 높이 저장
        int leftMax = 0, rightMax = 0;
        int ans = 0;

        while(left <= right) {
            //왼쪽 막대가 오른쪽 막대보다 낮다면
            if(height[left] < height[right]) {
                //현재 왼쪽 막대의 높이가
                //최대 높이라고 저장해둔 leftMax 보다 크거나 같다면
                if(height[left] >= leftMax)
                    //leftMax 업데이트 해주고
                    leftMax = height[left];
                else
                    //leftMax보다 height[left]보다 낮다면
                    //ans 에 그 차이를 더해준다.
                    ans += leftMax - height[left];
                //오른쪽으로 한칸 이동
                left++;
            }
            //오른쪽 막대가 왼쪽 막대보다 높거나 같다면
            else {
                if(height[right] >= rightMax)
                    rightMax = height[right];
                else
                    ans += rightMax - height[right];
                right--;
            }
        }

        return ans;
    }

}
