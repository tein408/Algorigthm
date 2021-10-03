package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1264 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = bf.readLine();

            if(str.equals("#"))
                break;

            int cnt = 0;

            for(int i=0; i<str.length(); i++) {
                char c = str.charAt(i);
                switch (c) {
                    case 'a' :
                    case 'A' :
                    case 'e' :
                    case 'E' :
                    case 'i' :
                    case 'I' :
                    case 'o' :
                    case 'O' :
                    case 'u' :
                    case 'U' :
                        cnt++;
                        break;
                }
            }
            System.out.println(cnt);

        }


    }
}
