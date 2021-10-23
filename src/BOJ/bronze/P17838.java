package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P17838 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        for(int j=0; j<t; j++) {
            String str = bf.readLine();

            if(str.length() == 7) {
                if(str.charAt(0) == str.charAt(1) && str.charAt(0) == str.charAt(4)
                && str.charAt(0) != str.charAt(2) && str.charAt(2) == str.charAt(3)
                && str.charAt(2) == str.charAt(5) && str.charAt(2) == str.charAt(6)
                ) {
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            } else {
                System.out.println(0);
            }
        }


    }
}
