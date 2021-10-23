package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P20551 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(arr);

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], i);
            }
        }

        for(int i=0; i<m; i++) {
            int d = Integer.parseInt(bf.readLine());
            if(map.containsKey(d))
                sb.append(map.get(d)).append("\n");
            else
                sb.append(-1).append("\n");

        }
        System.out.println(sb);

    }

}
