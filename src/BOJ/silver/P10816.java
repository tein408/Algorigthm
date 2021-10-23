package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10816 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        int[] arr = new int[num];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int temp;
        for(int i=0; i<m; i++) {
            temp = Integer.parseInt(st.nextToken());
            sb.append(upBound(arr, temp) - lowBound(arr, temp)+" ");
        }
        System.out.println(sb);

    }

    static int lowBound(int[] arr, int target) {
        int low = 0;
        int height = arr.length;
        while(low < height) {
            int mid = (low + height)/2;
            if(target <= arr[mid]) height = mid;
            else low = mid + 1;
        }
        return low;
    }

    static int upBound(int[] arr, int target) {
        int low = 0;
        int height = arr.length;
        while(low < height) {
            int mid = (low + height)/2;
            if(target < arr[mid]) height = mid;
            else low = mid + 1;
        }
        return low;
    }
}
