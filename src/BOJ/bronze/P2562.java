package BOJ.bronze;

import java.util.Scanner;

public class P2562 {

	public static void main(String[] args) {
		// 배열값을 9개 받은 후, 최대값을 구하고 그 값이 배열에서 몇번째 값인지 출력
		Scanner s = new Scanner(System.in);
		int arr[] = new int[9];
		int a=0;
		for(int i=0; i<arr.length; i++){
			a = s.nextInt();
		}
		
		int maxdata = 0;
		int count=0;
		for(int i=0; i<arr.length; i++){
			if(a>maxdata){
				maxdata=a;
				count=i;
			}
		}
		System.out.println(maxdata);
		System.out.println(count);
		
	}

}
