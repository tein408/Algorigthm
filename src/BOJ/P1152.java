package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1152 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        ArrayList<String> arr = new ArrayList<>();
        while(st.hasMoreTokens()){
            arr.add(st.nextToken());
        }

        System.out.println(arr.size());



    }
}
