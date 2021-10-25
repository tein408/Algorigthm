package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16237 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int[] arr = new int[5];
        int total = 0;

        for(int i=0; i<5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //5kg 부터 바구니에 담기
        total += arr[4];

        while(arr[3] > 0) {
            arr[3]--;
            if(arr[0] > 0)  // 4 + 1 = 5
                arr[0]--;
            total++;
        }

        while(arr[2] > 0) {
            arr[2]--;
            if(arr[1] > 0)  // 3 + 2 = 5
                arr[1]--;
            else if(arr[0] > 0) // 3 + 1 + 1 = 5
                arr[0] -= 2;
            total++;
        }

        while(arr[1] > 0) {
            arr[1]--;
            if(arr[1] >= 1) { // 2 + 2 + 1 = 5
                arr[1]--;
                arr[0]--;
            }
            else if(arr[0] > 0) // 2 + 1 + 1 + 1 = 5
                arr[0] -= 3;
            total++;
        }

        while(arr[0] > 0) {
            arr[0] -= 5; //1kg는 다섯개씩
            total++;
        }


        System.out.println(total);

    }
}
