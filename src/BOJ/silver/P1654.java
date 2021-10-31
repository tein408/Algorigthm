package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1654 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int k = Integer.parseInt(str.split(" ")[0]);
        int n = Integer.parseInt(str.split(" ")[1]);

        int[] arr = new int[k];
        for(int i=0; i<k; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }

        //binary search 위해 sort
        Arrays.sort(arr);

        int left = 0;
        int right = arr[k-1] + 1;
        int mid = 0;

        //binary search
        while(left < right) {
            mid = (left + right) / 2;
            int len = 0;

            for(int i=0; i<k; i++) {
                len += (arr[i] / mid);
            }

            if(len < n)
                right = mid;
            else
                left = mid + 1;
        }

        System.out.println(right - 1);

    }
}
