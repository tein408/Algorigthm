import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P22981 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String nk = bf.readLine();
        int n = Integer.parseInt(nk.split(" ")[0]);
        double k = Double.parseDouble(nk.split(" ")[1]);

        st = new StringTokenizer(bf.readLine(), " ");

        int[] v = new int[n];
        
        for(int i=0; i<n; i++) {
            v[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(v);

        int left = 1;
        int max = 0;
        int sum = 0;

        while(left < n) {
            sum = (left * v[0]) + ((n-left) * v[left]);
            if(max < sum) max = sum;
            left++;
        }

        System.out.println((int) Math.ceil(k/sum));
    }
}
