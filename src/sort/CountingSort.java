package sort;

import java.util.Scanner;

public class CountingSort {

    static int MAX_SIZE = 1000;
    static int MAX_NUM = 10000;

    public static void main(String[] args) {
        int N;
        int[] A = new int[MAX_SIZE+1];
        int[] B = new int[MAX_SIZE+1];
        int[] count = new int[MAX_NUM+1];
        int[] countSum = new int[MAX_NUM+1];

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); //N <= MAX_SIZE

        for(int i=0; i<=N; i++)
            count[i] = 0;
        for(int i=1; i<=N; i++) {
            A[i] = sc.nextInt(); //A에 입력되는 수 <= MAX_NUM
            count[A[i]]++; //숫자 등장 횟수 세기
        }

        //누적합 구성
        countSum[0] = count[0];
        for(int i=0; i<=MAX_NUM; i++)
            countSum[i] = countSum[i-1] + count[i];

        //뒤에서부터 수열 A순회
        for(int i=N; i>=1; i--){
            B[countSum[A[i]]] = A[i];
            countSum[A[i]]--;
        }

        //수열 A를 정렬한 결과인 수열 B를 출력
        for(int i=1; i<=N; i++)
            System.out.println(B[i]);


    }
}
