package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2470 {
    static int[] ans;
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        ans = new int[2];

        solv(arr);

        for(int i : ans)
            System.out.println(i);

    }

    static int[] solv(int[] arr) {
        long min = Integer.MAX_VALUE;
        int left = 0;
        int right = arr.length-1;

        while(left < right) {
            long sum = Math.abs(arr[left] + arr[right]);

            if(sum < min) {
                min = sum;
                ans[0] = arr[left];
                ans[1] = arr[right];
            }
            if(arr[left] + arr[right] > 0)
                right--;
            else
                left++;
        }
        return ans;
    }

}
