package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P14470 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());
        int e = Integer.parseInt(bf.readLine());

        int iceToHaedong = 0;
        int toHot = 0;
        int ans = 0;

        if(a<0) {
            int temp = -a*c;
            iceToHaedong = temp + d;
            toHot = b*e;
        } else {
            toHot = (b-a) * e;
        }

        ans = iceToHaedong + toHot;

        System.out.println(ans);
    }
}
