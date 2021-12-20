package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P1302 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        if(n < 2) {
            System.out.println(bf.readLine());
            return;
        }

        Map<String, Integer> book = new HashMap<>();

        while(n-- > 0) {
            String name = bf.readLine();
            book.put(name, book.getOrDefault(name, 0)+1);
        }

        int max = 0;
        for(String str : book.keySet()) {
            max = Math.max(max, book.get(str));
        }

        List<String> list = new ArrayList<>(book.keySet());
        Collections.sort(list);
        for(String str : list) {
            if(book.get(str) == max) {
                System.out.println(str);
                break;
            }
        }

    }
}
