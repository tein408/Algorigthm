package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P2204 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int t = Integer.parseInt(bf.readLine());
            if(t == 0)
                break;

            String[] arr = new String[t];
            Map<String, String> map = new HashMap<>();

            for(int i=0; i<t; i++) {
                String temp = bf.readLine();
                arr[i] = temp.toLowerCase();
                map.put(arr[i], temp);
            }

            Arrays.sort(arr);
            System.out.println(map.get(arr[0]));

        }

    }
}
