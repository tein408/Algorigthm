package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3003 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int[] ans = {1,1,2,2,2,8};

        for(int i=0; i<6; i++) {
            int temp = Integer.parseInt(st.nextToken());
            System.out.print(ans[i] - temp + " ");
        }

    }
}
