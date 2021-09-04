package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P11719 {
    public static void main(String[] args) throws Exception {
        /*Scanner s = new Scanner(System.in);
        while (s.hasNext()){
            String text = s.nextLine();
            System.out.println(text);
            if(!s.hasNext()){
                break;
            }
        }*/

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = null;

        while((str=bf.readLine()) != null){
            if(str==null) break;
            bw.write(str+"\n");
        }

        bw.flush();
        bw.close();
        bf.close();





    }
}
