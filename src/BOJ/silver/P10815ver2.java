package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10815ver2 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        boolean[] arr = new boolean[200000001];

        for(int i=0; i<n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[temp + 10000000] = true;
        }

        int m = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine(), " ");

        for(int i=0; i<m; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(arr[temp + 10000000])
                sb.append(1).append(" ");
            else
                sb.append(0).append(" ");
        }
        System.out.println(sb);

    }
}
