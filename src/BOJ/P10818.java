package BOJ;

import java.util.Scanner;

public class P10818 {

	public static void main(String[] args) {
		// 
		Scanner s = new Scanner(System.in);
		
		int arrlength = s.nextInt();
		int arr[] = new int[arrlength];
		
		for(int i=0; i<arrlength; i++){
			int a = s.nextInt();
			arr[i] = a;
		}
		
		int maxdata =arr[0];
		int mindata=arr[0];
		for(int i=0; i<arr.length; i++){
			if(maxdata<arr[i]){
				maxdata=arr[i];
			}
			if(mindata>arr[i]){
				mindata=arr[i];
			}
		}
		System.out.println(mindata+" "+maxdata);
		
		

	}

}
