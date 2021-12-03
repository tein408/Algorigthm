package Programmers.level2;

//행렬 테두리 회전하기
public class PG77485 {

    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] map = new int[rows][columns];
        int idx = 1;
        int min = 0;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                map[i][j] = idx++;
            }
        }

        for(int k=0; k<queries.length; k++) {
            int x1 = queries[k][0]-1;
            int y1 = queries[k][1]-1;
            int x2 = queries[k][2]-1;
            int y2 = queries[k][3]-1;

            int start = map[x1][y1];
            min = start;
            //윗줄 가로
            for(int i=x1; i<x2; i++) {
                map[i][y1] = map[i+1][y1];
                min = Math.min(min, map[i][y1]);
            }
            //오른쪽 세로
            for(int i=y1; i<y2; i++) {
                map[x2][i] = map[x2][i+1];
                min = Math.min(min, map[x2][i]);
            }
            //아랫줄 가로
            for(int i=x2; i>x1; i--) {
                map[i][y2] = map[i-1][y2];
                min = Math.min(min, map[i][y2]);
            }
            //왼쪽 세로
            for(int i=y2; i>y1; i--) {
                map[x1][i] = map[x1][i-1];
                min = Math.min(min, map[x1][i]);
            }
            map[x1][y1+1] = start;
            answer[k] = min;
        }

        return answer;
    }

}
