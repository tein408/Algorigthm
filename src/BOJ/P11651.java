package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P11651 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st;

        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        //Arrays.sort(T[] a, Comparator<T> c) 사용
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                //첫번째 원소가 같다면 두번째 원소끼리 비교
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });

        //보다 빠른 출력 위해 StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }

        System.out.println(sb);

    }
}
