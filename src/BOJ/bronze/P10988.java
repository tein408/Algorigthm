package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10988 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        int len = str.length();
        int mid = len/2;

        char[] arr = new char[mid];
        char[] arr2 = new char[len-mid];

        for(int i=0; i<mid; i++) {
            arr[i] = str.charAt(i);
        }
        for(int i=0; i<arr2.length; i++) {
            arr2[i] = str.charAt(mid+i);
        }

        int cnt = 0;
        int idx = arr2.length-1;
        for(int i=0; i<mid; i++) {
            if(arr[i] == arr2[idx])
                cnt++;
            idx--;
        }

        System.out.println(cnt == mid ? 1:0);

    }
}
