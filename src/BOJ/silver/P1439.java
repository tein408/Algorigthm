package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1439 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        char[] c = str.toCharArray();

        int zero = 0, one = 0;

        if(c[0] == '0')
            zero++;
        else
            one++;

        for(int i=1; i<c.length; i++) {
            if(c[i-1] != c[i]) {
                if(c[i] == '0')
                    zero++;
                else
                    one++;
            }
        }

        System.out.println(Math.min(zero, one));

    }
}
