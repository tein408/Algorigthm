package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1193 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        int line = 0;
        int total = 0;

        while(true) {
            line++;
            total += line;
            if(total >= num) break;
        }

        int i = num - (total - line);
        int a = line+1-i;
        if(line % 2 == 0) System.out.println(i +"/"+ a);
        else System.out.println(a +"/"+ i);


    }
}
