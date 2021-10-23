package BOJ.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P17219 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            map.put(st.nextToken(), st.nextToken());
        }

        for(int i=0; i<m; i++) {
            String temp = bf.readLine();
            bw.write(map.get(temp));
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
