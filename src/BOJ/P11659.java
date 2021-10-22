package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P11659 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        int[] sum = new int[n+1];
        arr[0] = 0;

        st = new StringTokenizer(bf.readLine(), " ");
        int temp = 0;
        for(int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            temp += arr[i];
            sum[i] = temp;
        }

        while(m-- > 0) {
            st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int ans = sum[b] - sum[a-1];

            bw.write(ans+"");
            bw.newLine();

        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
