package leetcode;

public class L59SpiralMatrix2 {

    public static void main(String[] args) {

        int num = 3;

        int[][] arr = generateMatrix(num);

        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] generateMatrix(int n) {
        int x = n;
        int count = 1;
        int[][] copy = new int[x][x];
        int flag = 0;
        int i = 0, j = 0;

        while (true) {
            switch (flag) {
                case 0:
                    copy[i][j++] = count++;
                    if (j == x || copy[i][j] != 0) {
                        i++; j--; flag = 1;
                    }
                    break;
                case 1:
                    copy[i++][j] = count++;
                    if (i == x || copy[i][j] != 0) {
                        i--; j--; flag = 2;
                    }
                    break;
                case 2:
                    copy[i][j--] = count++;
                    if (j == -1 || copy[i][j] != 0) {
                        i--; j++; flag = 3;
                    }
                    break;
                case 3:
                    copy[i--][j] = count++;
                    if (i == 0 || copy[i][j] != 0) {
                        i++; j++; flag = 0;
                    }
                    break;
            }
            if (count > x*x) break;
        }
        return copy;
    }

}
