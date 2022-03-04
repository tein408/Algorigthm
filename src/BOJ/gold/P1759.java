package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1759 {

    static int n, c;
    static char[] arr;
    static boolean[] visit;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        arr = new char[c];
        visit = new boolean[c];

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<c; i++) {
            arr[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(arr);
        search(0, 0);
    }

    static void search(int start, int len) {
        if(len == n) {
            StringBuilder sb = new StringBuilder();
            int v = 0, cc = 0;
            for(int i=0; i<c; i++) {
                if(visit[i]) {
                    sb.append(arr[i]);

                    if(check(arr[i]))
                        v++;
                    else
                        cc++;
                }
            }
            if(v >=1 && cc >=2)
                System.out.println(sb);
        }

        for(int i=start; i<c; i++) {
            visit[i] = true;
            search(i+1, len+1);
            visit[i] = false;
        }

    }

    static boolean check(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        return false;
    }

}
