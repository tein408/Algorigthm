package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2480 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int res = 0;

        if(arr[0]==arr[1] && arr[1]==arr[2])
            res = 10000 + arr[0] * 1000;
        else if(arr[0] == arr[1])
            res = 1000 + arr[0] * 100;
        else if(arr[1] == arr[2])
            res = 1000 + arr[1] * 100;
        else if(arr[2] == arr[0])
            res = 1000 + arr[2] * 100;
        else
            res = arr[2] * 100;

        System.out.println(res);

    }
}
