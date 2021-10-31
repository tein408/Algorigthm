package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2609 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(gcd(a,b));
        System.out.println((a*b)/gcd(a,b));

    }

    public static int gcd(int m, int n) {
        if(m<n){
            int temp = m; m=n; n=temp;
        }
        if(m%n==0) return n;
        else return gcd(n, m%n);
    }

}
