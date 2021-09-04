package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15953 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        StringTokenizer st;
        while(num-- > 0){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int sum = 0;

            if(a==1) sum += 5000000;
            else if(a>1 && a<4) sum += 3000000;
            else if(a>3 && a<7) sum += 2000000;
            else if(a>6 && a<11) sum += 500000;
            else if(a>10 && a<16) sum += 300000;
            else if(a>15 && a<22) sum += 100000;
            else if(a>21) sum += 0;

            if(b==1) sum+=5120000;
            else if(b>1 && b<4) sum += 2560000;
            else if(b>3 && b<8) sum += 1280000;
            else if(b>7 && b<16) sum += 640000;
            else if(b>15 && b<32) sum += 320000;
            else if(b>31) sum += 0;

            System.out.println(sum);

        }

    }
}
