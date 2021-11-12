package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9184 {

    static int[][][] arr = new int[21][21][21];

    static int w(int a, int b, int c) {
        if(a<=0 || b<=0 || c<=0)
            return 1;

        else if(a>20 || b>20 || c>20) {
            arr[20][20][20] = w(20,20,20);
            return w(20,20,20);
        }

        else if(arr[a][b][c] == 0) {
            if(a<b && b<c) {
                arr[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
                return arr[a][b][c];
            } else {
                arr[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
                return arr[a][b][c];
            }
        }
        return arr[a][b][c];
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == -1 && b == -1 && c == -1)
                break;

            sb.append("w(");
            sb.append(a + ", " + b + ", " + c);
            sb.append(") = ");
            sb.append(w(a,b,c));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
