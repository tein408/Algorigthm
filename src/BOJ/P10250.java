package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(bf.readLine());

        int h, n;
        StringTokenizer st;
        while(num-- > 0){
            st = new StringTokenizer(bf.readLine(), " ");
            h = Integer.parseInt(st.nextToken());
            st.nextToken();
            n = Integer.parseInt(st.nextToken());
            if(n%h == 0){
                sb.append((h*100) + (n/h)).append('\n');
            }
            else {
                sb.append((n%h*100) + (n/h+1)).append('\n');
            }
        }
        System.out.println(sb);


    }
}
