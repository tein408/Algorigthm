package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class P1764 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String nums = bf.readLine();

        int n = Integer.parseInt(nums.split(" ")[0]);
        int m = Integer.parseInt(nums.split(" ")[1]);

        HashSet<String> hashSet = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();

        for(int i=0; i<n; i++) {
            hashSet.add(bf.readLine());
        }

        for(int i=0; i<m; i++) {
            String temp =  bf.readLine();
            if(hashSet.contains(temp))
                arrayList.add(temp);
        }

        Collections.sort(arrayList);
        System.out.println(arrayList.size());
        for(int i=0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }


    }
}
