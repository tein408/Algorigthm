package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P14912 {
    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int num = Integer.parseInt(st.nextToken());
        Integer digit = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for(int i=1;i<=num;i++){
            int temp = i;
            while(temp !=0 ){
                if(temp%10 == digit) cnt++;
                temp/=10;
            }
        }

        bw.write(cnt+"\n");
        bw.flush();
        bw.close();


    }
}
