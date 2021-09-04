package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11720 {

    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int sum = 0;
        String s = bf.readLine();

        for(int i=0; i<num; i++){
            //sum += Integer.parseInt(s.split("")[i]);
            sum += s.charAt(i)-'0';

        }
        System.out.println(sum);


    }

}
