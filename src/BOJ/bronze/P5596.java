package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5596 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int a = 0;
        int b = 0;

        for(int i=0; i<4; i++)
            a += Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<4; i++)
            b += Integer.parseInt(st.nextToken());

        if(a == b)
            System.out.println(a);
        else
            System.out.println(Math.max(a,b));

    }

}
