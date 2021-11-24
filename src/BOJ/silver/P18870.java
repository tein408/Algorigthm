package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P18870 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int[] arr = new int[n];
        int[] clone = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            clone[i] = arr[i];
        }

        Arrays.sort(clone);

        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for(int i=0; i<n; i++) {
            if(!map.containsKey(clone[i]))
                map.put(clone[i], idx++);
        }

        for(int i=0; i<n; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb);

    }
}
