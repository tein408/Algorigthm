package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class P10757 {
	public static void main(String[] args) throws Exception {
		/*BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());*/
		
		/*String ss = st.nextToken();
		String sd = st.nextToken();
		BigInteger test1 = new BigInteger(st.nextToken()).add(new BigInteger(st.nextToken()));*/
		
		//System.out.println(new BigInteger(st.nextToken()).add(new BigInteger(st.nextToken())));
		//System.out.println("st : "+st.nextToken().getClass());
		
		Scanner s = new Scanner(System.in);
		BigInteger a,b;
		a=new BigInteger(s.next());
		b=new BigInteger(s.next());
		System.out.println(a.add(b));
		
	}
}
