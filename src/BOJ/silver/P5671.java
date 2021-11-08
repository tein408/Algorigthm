package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5671 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        String str = "";
        while((str = bf.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for(int i=a; i<b+1; i++) {
                int[] arr = new int[10];
                String temp = i+"";
                int chk = 1;
                for(int j=0; j<temp.length(); j++) {
                    arr[temp.charAt(j) - '0']++;
                    if(arr[temp.charAt(j) - '0'] != 1)
                        chk = 0;
                }
                cnt += chk;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);

    }
}
