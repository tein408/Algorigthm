package BOJ.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11931 {

    static int num;
    static int[] nums, ans;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        boolean[] arr = new boolean[2000001];

        for(int i=0; i<num; i++){
            arr[Integer.parseInt(bf.readLine())+1000000] = true;
        }

        for(int i=0; i< arr.length; i++){
            if(arr[i]) sb.append(i-1000000+"\n");
        }
        System.out.println(sb);



    }
}


