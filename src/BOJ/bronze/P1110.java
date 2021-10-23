package BOJ.bronze;

import java.io.*;

public class P1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int c = a;
		int cnt = 0;
		while(true){
			cnt++;
			c = (c%10*10) + ((c/10+c%10)%10);
			System.out.println("c : "+c);
			if(a == c) break;
		}
		System.out.println("cnt : "+cnt);
	}
}
