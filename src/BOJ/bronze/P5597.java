package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5597 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[30];

        for(int i=0; i<28; i++) {
            int idx = Integer.parseInt(bf.readLine()) - 1;
            arr[idx]++;
        }

        for(int i=0; i<30; i++) {
            if(arr[i] == 0)
                System.out.println(i+1);
        }

    }
}
