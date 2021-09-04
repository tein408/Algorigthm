import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2981 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr);
        int result = 0;
        while(num-- > 1) {
            result = gcd(arr[num], arr[num-1]);
            System.out.println(result);
        }

    }

    static int gcd(int a, int b) {
        int temp;
        while(b>0) {
            int tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }

}
