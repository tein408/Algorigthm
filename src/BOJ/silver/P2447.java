package BOJ.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2447 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());

        String[][] star = new String[n][n];

        //먼저 공백으로 초기화
        for(int i=0; i<star.length; i++) {
            for (int j = 0; j < star[0].length; j++) {
                star[i][j] = " ";
            }
        }

        //별 공장 작동
        printStar(star, 0, 0, n);

        //출력
        for(int i=0; i<star.length; i++) {
            for (int j = 0; j < star[0].length; j++) {
                bw.write(star[i][j]);
            }
            bw.write("\n");
        }

        bw.flush();

        bw.close();
        bf.close();

    }

    static void printStar(String[][] star, int x, int y, int n) {
        //더이상 쪼갤 수 없으면 * 입력
        if(n==1) {
            star[x][y] = "*";
            return;
        }

        // n/3 마다 재귀 호출
        // 단, 공백으로 지정해야되는 칸 제외
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(!(i==1 && j==1)) {
                    printStar(star, x+i*(n/3), y+j*(n/3), n/3);
                }
            }
        }
    }

}
