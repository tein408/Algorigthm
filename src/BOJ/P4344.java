package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4344 {
    public static void main(String[] args) throws Exception{
        /*첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
          둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
          이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
          각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.*/
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int[] arr;

        StringTokenizer st;

        for(int i = 0; i<num; i++){
            st = new StringTokenizer(bf.readLine(), " ");
            int student = Integer.parseInt(st.nextToken());
            arr = new int[student];
            float sum=0f, avg = 0f;
            int count = 0;

            for(int j=0; j<student; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            avg = sum/student;
            for(int j=0; j<student; j++)
                if(avg < arr[j]) count++;

            System.out.println(String.format("%.3f", (float)count/student*100) + "%");
        }

    }
}
