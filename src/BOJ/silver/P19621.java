package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P19621 {

    static int[] meet;
    static int n, total;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bf.readLine());

        meet = new int[n];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int people = Integer.parseInt(st.nextToken());
            meet[i] = people;
        }

        search(0, 0);

        System.out.println(total);
    }

    static void search(int idx, int person) {
        if(idx > n - 1) {
            total = Math.max(total, person);
            return;
        } else {
            search(idx + 1, person);
            search(idx + 2, person + meet[idx]);
        }
    }
}


