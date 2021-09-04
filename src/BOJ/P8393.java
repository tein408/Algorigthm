package BOJ;

import java.util.Scanner;

public class P8393 {

	public static void main(String[] args) {
		// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		//1부터 n까지 합을 출력한다.
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int sum=0;
		for(int i=0; i<=n; i++){
			sum+=i;
		}
		System.out.println(sum);
		
		
		//short
//		int a=new java.util.Scanner(System.in).nextInt();
//		System.out.print((a+1)*a/2);
		// -> 1~n 까지의 합을 쉽게 구한다.
		
		

	}

}
