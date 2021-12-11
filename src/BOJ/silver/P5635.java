package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P5635 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, String> map = new HashMap<>();
        int n = Integer.parseInt(bf.readLine());
        int[] olds = new int[n];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            String name = st.nextToken();
            int date = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            int old = year * 1000 + month * 100 + date;
            map.put(old, name);
            olds[i] = old;
        }

        Arrays.sort(olds);

        System.out.println(map.get(olds[n-1]));
        System.out.println(map.get(olds[0]));
    }
}
