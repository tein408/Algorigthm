package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10039 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int avg = 0;
        for(int i=0; i<5; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            if(arr[i]<=40) arr[i] = 40;
            avg += arr[i]/5;
        }
        System.out.println(avg);




    }
}
