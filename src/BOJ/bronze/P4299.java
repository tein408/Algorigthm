package BOJ.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4299 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int hap = Integer.parseInt(st.nextToken());
        int cha = Integer.parseInt(st.nextToken());
        int a,b;
        a = (hap+cha)/2;
        b = hap - a;

        if(hap<cha) System.out.println(-1);
        else if(a+b==hap && Math.abs(a-b)==cha) {
                System.out.println(Math.max(a,b)+" "+Math.min(a,b));
        }
        else System.out.println(-1);


    }
}
