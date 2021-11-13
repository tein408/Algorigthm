package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P13866 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int[] arr = new int[4];
        for(int i=0; i<4; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        int a = arr[3]+arr[0];
        int b = arr[1]+arr[2];
        System.out.println(Math.abs(a-b));
    }
}
