package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P10984 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int hakki = Integer.parseInt(bf.readLine());

        for(int j=0; j<hakki; j++) {
            int num = Integer.parseInt(bf.readLine());
            String[] arr = new String[num];
            for (int i = 0; i < num; i++) {
                arr[i] = bf.readLine();
            }

            float hap = 0;
            int a = 0;
            for (int i = 0; i < num; i++) {
                a += Integer.parseInt(arr[i].split(" ")[0]);
                hap += Float.parseFloat(arr[i].split(" ")[1]) * Integer.parseInt(arr[i].split(" ")[0]);
            }
            float avg = hap / a;
            System.out.println(a+" " + String.format("%.1f", avg));
            //for(String i : arr) System.out.println(i);
        }



    }
}
