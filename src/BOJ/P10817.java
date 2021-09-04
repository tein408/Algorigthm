package BOJ;

import java.io.*;
import java.util.*;
public class P10817 {
    public static void main(String[] args) throws Exception {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] list = new int[3];
        for(int i=0;i<3;i++)
        	list[i]=Integer.parseInt(st.nextToken());
        Arrays.sort(list);
        System.out.println(list[1]);
    }
}
