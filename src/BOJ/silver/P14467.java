package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P14467 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] cow = new int[10];
        Arrays.fill(cow, -1);
        int cnt = 0;

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int num = Integer.parseInt(st.nextToken());
            int loc = Integer.parseInt(st.nextToken());
            if(cow[num-1] == -1) {
                cow[num-1] = loc;
            } else if(cow[num-1] != loc){
                cow[num-1] = loc;
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
