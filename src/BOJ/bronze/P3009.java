package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3009 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(bf.readLine());
        String[] arr = new String[3];
        int answerX=0, answerY=0;
        for(int i=0; i<3; i++) {
            arr[i] = bf.readLine();
        }

        int a = Integer.parseInt(arr[0].split(" ")[0]);
        int b = Integer.parseInt(arr[1].split(" ")[0]);
        int c = Integer.parseInt(arr[2].split(" ")[0]);
        if(a==b) answerX = c;
        else if(a==c) answerX = b;
        else if(b==c) answerX = a;

        int d = Integer.parseInt(arr[0].split(" ")[1]);
        int e = Integer.parseInt(arr[1].split(" ")[1]);
        int f = Integer.parseInt(arr[2].split(" ")[1]);
        if(d==e) answerY = f;
        else if(d==f) answerY = e;
        else if(e==f) answerY = d;

        System.out.println(answerX + " " + answerY);

    }
}
