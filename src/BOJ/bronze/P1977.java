package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1977 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());

        int sum = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=m; i<=n; i++) {
            int a = (int) Math.sqrt(i);
            int temp = a * a;
            if (temp >= m && temp <= n) {
                if (!list.contains(temp))
                    list.add(temp);
            }
        }

        if (list.size() == 0) {
            System.out.println(-1);
            return;
        }

        for (int i : list)
            sum += i;

        System.out.println(sum);
        System.out.println(list.get(0));

    }
}
