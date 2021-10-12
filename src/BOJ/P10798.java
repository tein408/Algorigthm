package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10798 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[5];

        for(int i=0; i<5; i++) {
            str[i] = bf.readLine();
        }

        String re = "";

        int a = str[0].length();
        int b = str[1].length();
        int c = str[2].length();
        int d = str[3].length();
        int e = str[4].length();

        for(int i=0; i<15; i++) {
            if(i<a)
                re += str[0].charAt(i);
            if(i<b)
                re += str[1].charAt(i);
            if(i<c)
                re += str[2].charAt(i);
            if(i<d)
                re += str[3].charAt(i);
            if(i<e)
                re += str[4].charAt(i);
        }


        System.out.println(re);


    }
}
