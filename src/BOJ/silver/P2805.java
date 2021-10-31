package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2805 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int left = 0;
        int right = arr[n-1];
        int mid;

        while(left <= right) {
            mid = (left + right) / 2;
            long sum = 0;

            for(int i=0; i<n; i++) {
                //자르는 길이는 양수가 되어야하므로
                if(arr[i] >= mid)
                    sum += (arr[i] - mid);
            }

            //자른 나무 합이 m보다 작다면
            // 더 베어야한다는 뜻이므로 자르는 높이를 낮추고
            //-> right를 줄여야함
            if(sum < m)
                right = mid - 1;
            //그게 아니라면 덜 베어야하므로 높이를 높여야함.
            //-> left를 높여야함
            else {
                left = mid + 1;
            }

        }

        System.out.println(right);

    }

}
