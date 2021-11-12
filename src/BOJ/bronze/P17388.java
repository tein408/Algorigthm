package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P17388 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min = Math.min(s,k);
        min = Math.min(min, h);

        int sum = s+k+h;

        if(sum >= 100)
            System.out.println("OK");
        else {
            if(min == s)
                System.out.println("Soongsil");
            if(min == k)
                System.out.println("Korea");
            if(min == h)
                System.out.println("Hanyang");
        }


    }
}
