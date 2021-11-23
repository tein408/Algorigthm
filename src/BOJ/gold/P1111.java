package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1111 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        if(n == 1) {
            System.out.println("A");
            return;
        }

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if(n == 2) {
            if(arr[0] == arr[1]) {
                System.out.println(arr[0]);
                return;
            }
            else {
                System.out.println("A");
                return;
            }
        }

        if(n > 2 && arr[0] == arr[1]) {
            for(int i=1; i<n; i++) {
                if(arr[i] != arr[0]) {
                    System.out.println("B");
                    return;
                }
            }
            System.out.println(arr[0]);
            return;
        }

        int a = (arr[2] - arr[1]) / (arr[1] - arr[0]);
        int b = arr[1] - arr[0] * a;

        for(int i=1; i<n; i++) {
            if(arr[i] != (arr[i-1] * a + b)) {
                System.out.println("B");
                return;
            }
        }

        System.out.println(arr[n-1] * a + b);

    }
}
