package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P1620 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> monster1 = new HashMap<>();
        Map<String, String> monster2 = new HashMap<>();

        for(int i=0; i<n; i++) {
            String temp = bf.readLine();
            monster1.put(i+1+"", temp);
            monster2.put(temp, i+1+"");
        }

        for(int i=0; i<m; i++) {
            String temp = bf.readLine();
            char c = temp.charAt(0);
            if(c >= 'A' && c <= 'Z') {
                System.out.println(monster2.get(temp));
            }
            else {
                System.out.println(monster1.get(temp));
            }
        }




    }
}
