package BOJ;

import java.util.Scanner;
public class P10951 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNextInt()){
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(a+b);
		}
		s.close();
	}
}
