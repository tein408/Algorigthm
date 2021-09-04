import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1193 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int count = 1;
        int range = 2;

        if(num == 1) System.out.println(1 + "/" + 1);
        else {
            while(range <= num) {
                range = range + 1*count;
                count++;
            }
            System.out.println(count);
        }

    }
}
