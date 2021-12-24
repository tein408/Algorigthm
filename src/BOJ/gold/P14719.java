package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14719 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int[] arr = new int[w];

        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<w; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0, right = w - 1, leftMax = 0, rightMax = 0;
        int ans = 0;

        while(left <= right) {
            if(arr[left] < arr[right]) {
                if(arr[left] >= leftMax)
                    leftMax = arr[left];
                else
                    ans += leftMax - arr[left];
                left++;
            } else {
                if(arr[right] >= rightMax)
                    rightMax = arr[right];
                else
                    ans += rightMax - arr[right];
                right--;
            }
        }

        System.out.println(ans);
    }
}
