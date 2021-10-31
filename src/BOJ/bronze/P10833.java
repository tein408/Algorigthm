package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10833 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        StringTokenizer st;
        int nmg = 0;
        for(int i=0;i<num; i++){
            st = new StringTokenizer(bf.readLine()," ");
            int people = Integer.parseInt(st.nextToken());
            int school = Integer.parseInt(st.nextToken());
            nmg += school%people;
        }
        System.out.println(nmg);


    }
}
