import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P10814 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        String[][] arr = new String[n][2];

        for(int i=0; i<n; i++) {
            String temp = bf.readLine();
            arr[i][0] = temp.split(" ")[0];
            arr[i][1] = temp.split(" ")[1];
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }

        System.out.println(sb);

    }

}
