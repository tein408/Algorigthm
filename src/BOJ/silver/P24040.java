package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P24040 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(bf.readLine());

        while(t-- > 0) {

            long n = Long.parseLong(bf.readLine());

            if(n%3 == 2 || n%9 == 0)
                sb.append("TAK").append("\n");
            else
                sb.append("NIE").append("\n");
        }

        System.out.println(sb);
    }

}
