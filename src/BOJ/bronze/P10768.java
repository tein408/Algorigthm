package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10768 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());
        if(m==1)
            System.out.println("Before");
        else if(m>2)
            System.out.println("After");
        else if(m==2) {
            if(d==18)
                System.out.println("Special");
            else if(d>18)
                System.out.println("After");
            else
                System.out.println("Before");
        }
    }
}
