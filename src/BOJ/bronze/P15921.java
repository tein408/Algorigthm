package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15921 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        if(n==0) {
            System.out.println("divide by zero");
            return;
        }

        int sum = 0;
        double gi = 0;

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            sum += temp;
            gi += temp * ((double) 1 / n);
        }

        double avg = (double) sum / n;

        if(gi==0)
            System.out.println("divide by zero");
        else
            System.out.printf("%.2f\n", avg/gi);


    }
}
