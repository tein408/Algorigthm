package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2908 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int c = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
        int d = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());

        System.out.println(c>d? c:d);


    }
}
