package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1182 {

    static int n, s, cnt;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        search(0, 0);

        if(s == 0)
            cnt--;
        System.out.println(cnt);
    }

    static void search(int sum, int curr) {
        if(curr == n) {
            if(sum == s)
                cnt++;
            return;
        }

        search(sum + arr[curr], curr+1);
        search(sum, curr+1);
    }
}
