package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P7785 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<n; i++) {
            String name = bf.readLine().split(" ")[0];
            if(map.containsKey(name))
                map.remove(name);
            else
                map.put(name, "enter");
        }

        for(String s : map.keySet())
            list.add(s);

        Collections.sort(list);

        for(int i=list.size()-1; i>=0; i--)
            sb.append(list.get(i)).append("\n");

        System.out.println(sb);


    }


}
