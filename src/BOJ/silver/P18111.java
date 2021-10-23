package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P18111 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        int min = 257;
        int max = -1;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j<m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(max < arr[i][j])
                    max = arr[i][j];
                if(min > arr[i][j])
                    min = arr[i][j];
            }
        }

        int ansTime = Integer.MAX_VALUE;
        int ansHeight = -1;

        for(int i=min; i<=max; i++) { //최소 ~ 최대 (둘다 포함)
            int time = 0;
            int inv = b;

            for(int j=0; j<n; j++) {
                for(int k=0; k<m; k++) {
                    int diff = arr[j][k] - i;

                    if(diff > 0) { //최소높이보다 높음 => 파야함
                        time += Math.abs(diff) * 2;
                        inv += Math.abs(diff);
                    }
                    else if(diff < 0) {//최소높이보다 낮음 => 설치함
                        time += Math.abs(diff);
                        inv -= Math.abs(diff);
                    }
                }
            }

            if(inv >= 0) { //작업 후 인벤토리에 남은 블럭 수 확인
                if(time <= ansTime) {
                    ansTime = time;
                    ansHeight = i;
                }
            }
        }

        System.out.println(ansTime + " " + ansHeight);

    }
}
