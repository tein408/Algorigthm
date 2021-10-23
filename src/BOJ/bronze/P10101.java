package BOJ.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        if(a == b && b == c && a==60) System.out.println("Equilateral");
        else if((a+b+c)==180){
            if(a==b || a==c || b==c) System.out.println("Isosceles");
            else System.out.println("Scalene");
        }
        else System.out.println("Error");


    }
}
