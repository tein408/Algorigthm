package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P8958 {

	public static void main(String[] args) throws Exception {
		/*"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. 
		 * O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
		 * 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
		 * 예를 들어, 10번 문제의 점수는 3이 된다.
		"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
		OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.*/
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		String[] s = new String[num];
		for(int i=0;i<num;i++){
			s[i] = bf.readLine();
		}
		
		for(int i=0; i<num; i++) {
			int w = 0;
			int point = 0;
			
			for(int j=0; j<s[i].length(); j++){
				if(s[i].charAt(j)=='O') 
					w++; 
				else 
					w=0; 
				point += w;
			}
			System.out.println(point);
		}
		

	}

}
