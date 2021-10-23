package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1018 {

    static boolean[][] arr;
    static int min = 64;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //8*8 짜리 체스판을 만든다
        arr = new boolean[n][m];

        for (int i=0; i<n; i++) {
            String str = bf.readLine();
            for (int j=0; j<m; j++) {
                if (str.charAt(j) == 'W')
                    arr[i][j] = true;
                else
                    arr[i][j] = false;
            }
        }

        int nRow = n-7;
        int mRow = m-7;
        for (int i=0; i<nRow; i++) {
            for (int j=0; j<mRow; j++) {
                find(i,j);
            }
        }

        System.out.println(min);
    }

    static void find(int x, int y) {
        //8*8 칸을 찾아야하므로 각각 +8
        int endX = x + 8;
        int endY = y + 8;
        int count = 0;
        boolean color = arr[x][y];  //첫번째칸

        //첫칸인 arr[x][y] 부터 8번째 칸까지 검사
        for (int i=x; i<endX; i++) {
            for (int j=y; j<endY; j++) {
                //만들어둔 체스판과 비교, 다르면 count 1증가
                if (arr[i][j] != color) count++;
                //다음칸은 색이 바뀜 -> 값 변경
                color = !color;
            }
            color = !color;
        }

        count = Math.min(count, 64-count);
        min = Math.min(min, count);

    }


}
