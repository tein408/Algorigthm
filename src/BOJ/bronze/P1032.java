package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1032 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(bf.readLine());

        String[] arr = new String[n];
        for (int i=0; i<n; i++) {
            arr[i] = bf.readLine();
        }

        String first = arr[0];

        for (int i=0; i<first.length(); i++) {
            boolean diff = false;

            for (int j=0; j<n-1; j++) {
                if(arr[j].charAt(i) != arr[j+1].charAt(i)) {
                    diff = true;
                    break;
                }
            }

            if(diff)
                sb.append("?");
            else
                sb.append(first.charAt(i));
        }

        System.out.println(sb);

    }
}
