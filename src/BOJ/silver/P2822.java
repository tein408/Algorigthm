package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P2822 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[8];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<8; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            map.put(arr[i], i);
        }

        Arrays.sort(arr);
        int sum = 0;
        for(int i=7; i>2; i--) {
            sum += arr[i];
        }

        System.out.println(sum);

        int[] result = new int[5];
        for(int i=7; i>2; i--) {
            result[i-3] = map.get(arr[i]) + 1;
        }

        Arrays.sort(result);

        for(int i=0; i<5; i++) {
            System.out.print(result[i]+" ");
        }


    }
}
