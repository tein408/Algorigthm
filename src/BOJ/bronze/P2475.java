package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2475 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int[] arr = new int[5];
        int num = 0;
        for(int i=0; i<5; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int temp = 0;
        for(int i=0; i<5; i++){
            temp += arr[i]*arr[i];
        }
        num = temp%10;
        System.out.println(num);




    }
}
