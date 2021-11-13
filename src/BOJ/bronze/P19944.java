package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P19944 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if(m==1 || m==2) {
            System.out.println("NEWBIE!");
        } else {
            if(n>=m)
                System.out.println("OLDBIE!");
            else
                System.out.println("TLE!");
        }
    }
}
