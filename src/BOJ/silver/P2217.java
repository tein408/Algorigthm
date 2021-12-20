package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2217 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] rope = new int[n];
        for(int i=0; i<n; i++) {
            rope[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(rope);

        int max = rope[n-1];
        for(int i=0; i<n; i++) {
            max = Math.max(max, rope[i] * (n - i));
        }

        System.out.println(max);

    }
}
