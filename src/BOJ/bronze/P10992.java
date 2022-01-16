package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10992 {

    static String space = " ";
    static String star = "*";

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(bf.readLine());

        for(int i=1; i<n; i++){
            for(int j=0; j<n-i; j++){
                sb.append(space);
            }
            for(int j=0; j<2*i-1; j++){
                if(j==0 || j == 2*i-2)
                    sb.append(star);
                else
                    sb.append(space);
            }
            sb.append("\n");
        }

        for(int i=0; i<n * 2 -1; i++){
            sb.append(star);
        }

        System.out.println(sb);

    }
}
