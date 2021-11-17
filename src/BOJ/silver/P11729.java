package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11729 {

    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        sb.append((int)(Math.pow(2, n) - 1) + "\n");

        move(n, 1, 2, 3);

        System.out.println(sb);

    }

    static void move(int n, int start, int mid, int end) throws Exception {
        if(n==1) {
            sb.append(start + " "+ end + "\n");
            return;
        }
        move(n-1, start, end, mid);
        sb.append(start + " "+ end + "\n");
        move(n-1, mid, start, end);
    }

}
