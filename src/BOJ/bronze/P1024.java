package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1024 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        int n = Integer.parseInt(bf.readLine());

        for(int i=0; i<n; i++) {
            sb.append("*").append(" ");
        }

        for(int i=1; i<=n; i++) {
            if(i%2 == 1)
                sb2.append(sb).append("\n");
            else {
                sb2.append(sb.reverse()).append("\n");
                sb.reverse();
            }
        }

        System.out.println(sb2);
    }
}
