package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P17009 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        for(int i=3; i>0; i--)
            a += Integer.parseInt(bf.readLine()) * i;

        int b = 0;
        for(int i=3; i>0; i--)
            b += Integer.parseInt(bf.readLine()) * i;

        if(a > b)
            System.out.println("A");
        else if(a < b)
            System.out.println("B");
        else
            System.out.println("T");

    }
}
