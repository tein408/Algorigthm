package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11656 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        int len = str.length();
        String[] arr = new String[len];
        
        for(int i=0; i<len; i++) {
            String temp = str.substring(i, len);
            arr[i] = temp;
        }

        Arrays.sort(arr);

        for(int i=0; i<len; i++) {
            System.out.println(arr[i]);
        }
        

    }
}
