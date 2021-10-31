package BOJ.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P6378 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String n = "";
        StringBuilder sb = new StringBuilder();

        while (!(n = bf.readLine()).equals("0")) {
            String[] s = n.split("");
            int sum = 10;
            while(sum >= 10) {
                sum = 0;
                for(int i=0; i<s.length; i++)
                    sum += Integer.parseInt(s[i]);
                s = String.valueOf(sum).split("");
            }
            sb.append(sum + "\n");
        }
        System.out.println(sb);
    }
}
