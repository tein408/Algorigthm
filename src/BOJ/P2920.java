package BOJ;

import java.util.Scanner;

public class P2920 {

	public static void main(String[] args) {
		// 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어
		// 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
		// 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면
		// mixed 이다.
		// 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을
		// 작성하시오.
		
		Scanner s = new Scanner(System.in);
		int[] a = new int[8];
//		for(int i=0; i<a.length; i++){
//			a[i]=i+1;
//		}
		
		int[] c = new int[8];
		for(int i=0; i<a.length; i++){
			c[i] = s.nextInt();
		}
		
		
				
		for(int i=0; i<a.length; i++){
			a[i]=i+1;
			
			if(c[i]<=i+1){
				
			}
				
		}
		
		
		
	}

}
