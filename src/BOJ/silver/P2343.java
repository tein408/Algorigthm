package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2343 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int left = 0;
        int right = 0;

        int[] arr = new int[n];
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            right += arr[i];
            left =  left > arr[i] ? left : arr[i]; // 최댓값 저장
        }

        int mid = 0;

        while(left <= right) {
            mid = (left + right) / 2;
            int sum = 0;
            int cnt = 0;

            for(int i=0; i<n; i++) {
                
                if(sum + arr[i] > mid) {
                    sum = 0;
                    cnt++;
                }
                sum += arr[i];
            }
            
            //블루레이를 담지 못한 경우
            if(sum <= mid)
                cnt++;

            if(cnt <= m) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        System.out.println(left);

    }

}
