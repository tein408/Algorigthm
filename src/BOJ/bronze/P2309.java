package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2309 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int total = 0;

        for(int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            total += arr[i];
        }

        boolean chk = false;
        for(int i = 0; i < 9; i++) {
            for(int j = i+1; j < 9; j++) {
                if(total - arr[i] - arr[j] == 100) {
                    arr[i] = -1;
                    arr[j] = -1;
                    chk = true;
                    break;
                }
            }
            if(chk) break;
        }

        Arrays.sort(arr);
        for(int i=2; i<9; i++) {
            System.out.println(arr[i]);
        }

    }
}
