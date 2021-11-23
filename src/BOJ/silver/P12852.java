package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P12852 {

    static int[] arr;
    static int[] prev;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        arr = new int[n+1];
        prev = new int[n+1];

        arr[1] = 0;
        prev[0] = prev[1] = 0;

        System.out.println(solv(n));

        while(n != 0) {
            System.out.print(n + " ");
            n = prev[n];
        }
    }

    static int solv(int n) {
        for(int i=2; i<=n; i++) {
            arr[i] = arr[i-1] + 1;
            prev[i] = i - 1;

            if(i%2 == 0 && arr[i] > arr[i/2] + 1) {
                arr[i] = Math.min(arr[i], arr[i/2] + 1);
                prev[i] = i / 2;
            }
            if(i%3 == 0 && arr[i] > arr[i/3] + 1) {
                arr[i] = Math.min(arr[i], arr[i/3] + 1);
                prev[i] = i / 3;
            }
        }
        return arr[n];
    }
}
