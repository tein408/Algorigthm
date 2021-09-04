package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int i = 0; i< num ; i++){
            st = new StringTokenizer(bf.readLine()," ");
            long a = Long.parseLong(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            b = b % 4 + 4;
            long answer = 1;
            while(b-- > 0){
                answer = answer%10 * a;
            }
            sb.append(answer%10==0? 10:answer%10).append('\n');

        }
        System.out.println(sb);


    }


}
