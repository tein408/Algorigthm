package BOJ.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P15552 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(bf.readLine());
		while(t>0) {
			/*String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s," ");*/
			String[] s = bf.readLine().split(" ");
			/*int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);*/
			bw.write((Integer.parseInt(s[0])+Integer.parseInt(s[1]))+"\n");
			t--;
		}
		bw.flush();
		bw.close();
	}
}
