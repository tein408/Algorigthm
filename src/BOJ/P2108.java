package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P2108 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        int[] idx = new int[8001];
        int avg, mid, max = 0, range, sum = 0;

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            sum += arr[i];
            idx[arr[i] + 4000]++;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<8001; i++) {
            if(idx[i] >= max) {
                max = idx[i];
            }
        }
        for(int i=0; i<8001; i++) {
            if(idx[i] == max) {
                list.add(i-4000);
            }
        }

        Arrays.sort(arr);
        Collections.sort(list);

        if(list.size() == 1)
            max = list.get(0);
        else
            max = list.get(1);

        avg = (int) Math.round( (double) sum/n );
        mid = arr[n/2];
        range = arr[n-1] - arr[0];

        System.out.println(avg);
        System.out.println(mid);
        System.out.println(max);
        System.out.println(range);

    }
}
