package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1259 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            String n = bf.readLine();
            boolean result = false;

            if(n.length() == 1){
                if(n.equals("0")) break;
                else result = true;
            }
            else {
                String temp = "";
                for(int i=n.length()-1; i>=0; i--) {
                    temp += n.charAt(i);
                }
                if(n.equals(temp))
                    result = true;
                else
                    result = false;
            }
            if(result)
                System.out.println("yes");
            else
                System.out.println("no");
        }


    }
}
