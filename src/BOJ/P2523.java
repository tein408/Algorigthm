package BOJ;

import java.util.Scanner;

public class P2523 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			//for(int j=n; j>i; j--){
			//System.out.print(" ");
			//}
			
			System.out.println();
		}
		for(int i=1; i<=n; i++){
			for(int j=n; j>i; j--){
			System.out.print("*");
			}
			//for(int j=1; j<=i; j++){
			//	System.out.print(" ");
			//}
			System.out.println();
		}
		
		
		
	}//main
}
