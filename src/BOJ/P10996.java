package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10996 {

    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        //출력
        for(int i=0; i<n; i++) {
            printStar(n);
        }

        System.out.println(sb);


    }

    static void printStar(int n) {
        if(n == 1) {
            sb.append("*");
            return;
        }
        for(int i=0; i<2; i++) {
            for(int j=0; j<n; j++) {
                if(i == 0) {
                    if(j %2 != 0)
                        sb.append(" ");
                    else
                        sb.append("*");
                }
                else if(i == 1){
                    if(j %2 != 0)
                        sb.append("*");
                    else
                        sb.append(" ");
                }
            }
            sb.append("\n");
        }
    }

}
