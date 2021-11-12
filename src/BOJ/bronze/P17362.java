package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P17362 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        if(n%8 >= 1 && n%8 <= 5)
            System.out.println(n%8);
        else if(n%8 == 6)
            System.out.println(4);
        else if(n%8 ==7)
            System.out.println(3);
        else
            System.out.println(2);

    }
}
