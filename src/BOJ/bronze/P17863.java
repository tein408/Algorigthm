package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P17863 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        String sub = str.substring(0,3);
        if (sub.equals("555"))
            System.out.println("YES");
        else
            System.out.println("NO");

    }

}
