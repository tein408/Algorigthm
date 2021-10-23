package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class P1427 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String num = bf.readLine();
        Integer[] arr = new Integer[num.length()];
        for(int i=0; i<arr.length; i++){
            arr[i] = num.charAt(i)-'0';
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i:arr) System.out.print(i);
    }
}
