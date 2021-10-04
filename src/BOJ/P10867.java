package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P10867 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr.add(temp);
        }

        List<Integer> result = arr.stream().distinct().collect(Collectors.toList());

        Collections.sort(result);

        for(int i=0; i<result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }



    }
}
