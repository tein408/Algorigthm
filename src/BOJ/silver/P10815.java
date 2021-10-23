package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10815 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<m; i++) {
            int temp = Integer.parseInt(st.nextToken());
            int res = search(arr, temp);
            sb.append(res).append(" ");
        }

        System.out.println(sb);

    }

    static int search(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while(left <= right) {
            mid = (left + right) / 2;
            if(key == arr[mid])
                return 1;
            else if(key < arr[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return 0;
    }

}
