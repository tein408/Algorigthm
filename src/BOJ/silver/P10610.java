package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10610 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int[] arr = new int[10];
        long sum = 0;
        for(int i=0; i<str.length(); i++) {
            int temp = str.charAt(i)-'0';
            arr[temp]++;
            sum += temp;
        }

        if(!str.contains("0") || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        StringBuffer sb = new StringBuffer();
        for(int i=9; i>=0; i--) {
            while(arr[i] > 0) {
                sb.append(i);
                arr[i]--;
            }
        }
        System.out.println(sb);

    }
}
