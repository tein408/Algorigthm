package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class P11718 {
    public static void main(String[] args) throws Exception {


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
