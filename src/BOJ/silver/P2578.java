package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2578 {
    static int bingChk = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] arr = new int[5][5];
        int[] bingo = new int[25];

        for(int i=0; i<5; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            for(int j=0; j<5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int idx = 0;
        for(int i=0; i<5; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            for(int j=0; j<5; j++) {
                bingo[idx++] = Integer.parseInt(st.nextToken());
            }
        }

        for(int a=0; a<25; a++) {
            for(int i=0; i<5; i++) {
                for(int j=0; j<5; j++) {
                    int num = bingo[a];
                    if(arr[i][j] == num) {
                        arr[i][j] = 0;
                    }
                }
            }

            rowChk(arr);
            colChk(arr);
            leftChk(arr);
            rightChk(arr);

            if(bingChk >= 3) {
                System.out.println(a+1);
                break;
            }
            bingChk = 0;
        }

    }

    static void rowChk(int[][] arr) {
        for(int i=0; i<5; i++) {
            int zero = 0;
            for(int j=0; j<5; j++) {
                if(arr[i][j] == 0)
                    zero++;
            }
            if(zero == 5)
                bingChk++;
        }
    }

    static void colChk(int[][] arr) {
        for(int i=0; i<5; i++) {
            int zero = 0;
            for(int j=0; j<5; j++) {
                if(arr[j][i] == 0)
                    zero++;
            }
            if(zero == 5)
                bingChk++;
        }
    }

    static void leftChk(int[][] arr) {
        int zero = 0;
        for(int i=0; i<5; i++) {
            if(arr[i][i] == 0)
                zero++;
        }
        if(zero == 5)
            bingChk++;
    }

    static void rightChk(int[][] arr) {
        int zero = 0;
        for(int i=0; i<5; i++) {
            if(arr[i][4-i] == 0)
                zero++;
        }
        if(zero == 5)
            bingChk++;
    }

}
