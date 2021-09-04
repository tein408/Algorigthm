package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class P3052 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set = new HashSet<Integer>();
		int i=0;
		while(i<10){
			set.add(Integer.parseInt(bf.readLine())%42);
			i++;
		}
		
		System.out.println(set.size());
		

	}

}
