package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class P1758 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        long tip = 0;

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(arr);
        int idx = 0;
        for(int i=n-1; i>=0; i--) {
            int temp = arr[i];
            if(temp - idx > 0)
                tip += (temp-idx);
            idx++;
        }
        System.out.println(tip);

    }
}
