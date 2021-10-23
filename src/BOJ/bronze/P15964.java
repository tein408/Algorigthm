package BOJ.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15964 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        long a =  Long.parseLong(st.nextToken());
        long b =  Long.parseLong(st.nextToken());
        long re = (a+b) * (a-b);

        System.out.println(re);


    }
}
