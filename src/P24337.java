import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P24337 {
    static int[] building;
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        building = new int[n];

        if(a + b > n + 1) {
            System.out.println(-1);
            return;
        }

        Arrays.fill(building, 1);

        int top = n - b;
        if(a != 1)
            building[top] = Math.max(a, b);
        else
            building[0] = Math.max(a, b);

        int val = b;
        for(int i=top+1; val>1; i++) {
            building[i] = --val;
        }

        val = a;
        for(int i=top-1; val>1; i--) {
            building[i] = --val;
        }

        for(int i : building) {
            sb.append(i + " ");
        }

        System.out.println(sb);
    }

}
