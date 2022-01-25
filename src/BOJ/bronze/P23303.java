package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P23303 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        if(str.contains("D2") || str.contains("d2")) {
            System.out.println("D2");
        } else {
            System.out.println("unrated");
        }

    }
}
