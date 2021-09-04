package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P5543 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        int[] arr2 = new int[2];
        int sum = 0;
        for(int i=0; i<3; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }

        for(int i=0; i<2; i++) {
            arr2[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr);

        sum = arr[0] + (arr2[0]<arr2[1]?arr2[0]:arr2[1]) - 50;
        System.out.println(sum);



    }
}
