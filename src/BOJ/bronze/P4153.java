package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4153 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int a,b,c;
        while(true) {
            st = new StringTokenizer(bf.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if(a==0 && b==0 && c==0) break;
            sb.append(test(a,b,c)).append("\n");
        }
        System.out.println(sb);
    }

    static String test(int a, int b, int c) {
        String result;
        if(a*a == b*b + c*c) result = "right";
        else if(b*b == a*a + c*c) result = "right";
        else if(c*c == a*a + b*b) result = "right";
        else result = "wrong";
        return result;
    }

}
