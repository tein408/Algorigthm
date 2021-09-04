package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1920 {
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
            sb.append(search(arr, temp) + "\n");
        }
        System.out.println(sb);

    }

    static int search(int[] arr, int target) {
        int begin = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(begin <= end){
            mid = (begin + end) / 2;
            if(arr[mid] == target) return 1;
            else if(arr[mid] > target) end = mid - 1;
            else if(arr[mid] < target) begin = mid + 1;
        }
        return 0;
    }
}
