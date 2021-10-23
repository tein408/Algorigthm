package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P1380 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 1;

        while(true) {
            int n = Integer.parseInt(bf.readLine());

            if(n==0) break;

            String[] name = new String[n];
            ArrayList<String> arr = new ArrayList<>();

            for(int i=0; i<n; i++) {
                name[i] = bf.readLine();
            }

            for(int i=0; i<(2*n-1); i++) {
                String temp = bf.readLine().split(" ")[0];
                if(arr.contains(temp)) {
                    arr.remove(temp);
                } else {
                    arr.add(temp);
                }
            }

            for(int i=0; i<arr.size(); i++) {
                int temp = Integer.parseInt(arr.get(i))-1;
                System.out.println(cnt + " " + name[temp]);
            }

            cnt++;

        }

    }
}
