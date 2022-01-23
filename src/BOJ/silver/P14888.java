package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14888 {

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int[] arr;
    static int[] oper = new int[4];

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<4; i++) {
            oper[i] = Integer.parseInt(st.nextToken());
        }

        dfs(arr[0], 1);

        System.out.println(max);
        System.out.println(min);

    }

    static void dfs(int curr, int idx) {
        if(idx == arr.length) {
            max = Math.max(curr, max);
            min = Math.min(curr, min);
            return;
        }

        for(int i=0; i<4; i++) {
            if(oper[i] > 0) {
                oper[i]--;
                if(i == 0) {
                    dfs(curr + arr[idx], idx+1);
                } else if(i == 1) {
                    dfs(curr - arr[idx], idx+1);
                } else if(i == 2) {
                    dfs(curr * arr[idx], idx+1);
                } else if(i == 3) {
                    dfs(curr / arr[idx], idx+1);
                }
                oper[i]++;
            }
        }
    }
}
