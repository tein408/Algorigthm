package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2018 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int left = 1, right = 1;
        int sum = 0, cnt = 0;

        while(right <= n+1 && left <= right) {
            if(sum > n) {
                sum -= left;
                left++;
            } else if(sum < n) {
                sum += right;
                right++;
            } else {
                cnt++;
                sum += right;
                right++;
            }
        }

        System.out.println(cnt);
    }
}
