package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int need = Integer.parseInt(bf.readLine());

        hour += need/60;
        minute += need%60;

        while(minute > 59){
            minute -= 60;
            hour++;
        }
        while(hour > 23){
            hour -= 24;
        }


        System.out.println(hour + " " + minute);




    }
}
