package BOJ.bronze;

import java.util.Scanner;

public class P2439 {

	public static void main(String[] args) {
		// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 오른쪽 정렬하여 찍는 문제
		// n입력받는다.
		//     *
		//    **
		//   ***
		//  ****
		// *****
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1; i<=n; i++){
			for(int j=n; j>i; j--){
			System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
