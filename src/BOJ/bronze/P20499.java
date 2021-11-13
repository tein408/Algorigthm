package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P20499 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), "/");
        int k = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        if(k+a < d || d==0)
            System.out.println("hasu");
        else
            System.out.println("gosu");
    }
}
