package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2577 {

	public static void main(String[] args) throws Exception {
		/*세 개의 자연수 A, B, C가 주어질 때
		 * A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
		예를 들어 A = 150, B = 266, C = 427 이라면
		 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
		계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
		00373071
		3 	1 	0 	2 	0 	0  	0 	2 	0 	0 	*/
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		int c = Integer.parseInt(bf.readLine());
		int sum = a*b*c;
		int[] d = new int[10];
		while(sum!=0){
			int s = sum%10;
			sum = sum/10;
			System.out.println("sum : "+sum+", s : "+s);
			for(int i=0; i<10;i++) {
				if(i==s){
					d[i] += 1;
				}
			}
		}
		
		for(int i : d) {
			System.out.println(i);	
		}
		
	}
}
