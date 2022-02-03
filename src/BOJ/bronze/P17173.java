package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P17173 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[m];
        int[] res = new int[n+1];
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<m; i++) {
            for(int j=1; j<=n; j++) {
                if(j % arr[i] == 0) {
                    res[j] = j;
                }
            }
        }

        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += res[i];
        }

        System.out.println(sum);
    }

}
