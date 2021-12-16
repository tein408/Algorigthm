package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2947 {
    static int[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[5];

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while(true) {
            for(int i=0; i<4; i++) {
                if(arr[i] > arr[i+1]) {
                    swap(i, i+1);
                    printArr();
                }
            }

            if(arr[0] == 1 && arr[1] == 2 && arr[2] == 3 && arr[3] == 4 && arr[4] == 5 )
                break;
        }

    }

    static void swap(int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void printArr() {
        for(int i=0; i<5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
