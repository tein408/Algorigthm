package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1806 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solv(arr, s, n));
    }

    static int solv(int[] arr, int s, int n) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;

        while(true) {
            if(sum >= s) {
                sum -= arr[left];
                min = Math.min(min, (right - left));
                left++;
            } else if(right == n) {
                break;
            } else {
                sum += arr[right];
                right++;
            }
        }
        if(min == Integer.MAX_VALUE)
            return 0;
        return min;
    }


}
