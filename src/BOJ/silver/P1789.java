package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1789 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bf.readLine());
        long sum = 0;
        long cnt = 0;
        while(sum < n) {
            cnt++;
            sum += cnt;
        }
        if(sum > n)
            cnt--;
        System.out.println(cnt);
    }
}
