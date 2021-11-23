package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P3273 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(bf.readLine());

        Arrays.sort(arr);
        System.out.println(solv(arr, x));

    }

    static int solv(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int cnt = 0;

        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum == x) {
                cnt++;
                right--;
                left++;
            }
            else if(sum > x) {
                right--;
            }
            else {
                left++;
            }
        }

        return cnt;
    }

}
