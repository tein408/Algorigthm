package BOJ.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sc;

        int num = Integer.parseInt(bf.readLine());
        String[] str = new String[num];

        for(int i=0; i<num; i++){
            str[i] = bf.readLine();
        }

        for(int i=0; i<num; i++){
            sc = new StringTokenizer(str[i]," ");
            int temp = Integer.parseInt(sc.nextToken());
            String tmp = sc.nextToken();
            for(int j=0; j<tmp.length(); j++){
                char cc = tmp.charAt(j);
                for(int k = 0; k<temp; k++)
                    System.out.print(cc);
            }
            System.out.println();
        }


    }
}
