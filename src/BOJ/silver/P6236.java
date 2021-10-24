package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P6236 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int left = 0;
        int right = 0;

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            left = arr[i] > left ? arr[i] : left;
            right += arr[i];
        }

        while(left <= right) {
            int mid = (left + right) / 2;

            int sum = 0;
            int cnt = 0;

            for(int i=0; i<arr.length; i++) {
                if(sum + arr[i] > mid) {
                    sum = 0;
                    cnt++;
                }
                sum += arr[i];
            }

            if(sum != 0)
                cnt++;
            if(cnt <= m)
                right = mid - 1;
            else
                left = mid + 1;
        }

        System.out.println(left);

    }
}
