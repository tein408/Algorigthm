package sort;

import java.io.*;

public class CountingSortBJver {

    public static void main(String[] args) throws IOException {
        /*P10989
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int [] count = new int[10001];
        for(int i =0 ;i< n; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num] ++;
        }

        for(int i = 1; i< 10001; i++) {
            bw.write((i+"\n").repeat(count[i]));
        }
        bw.flush();
        br.close();
        bw.close();*/

        /*P2751
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		boolean[] arr = new boolean[2000001];
		int N = Integer.parseInt(br.readLine());

		for(int i = 0; i < N; i++) {
			arr[Integer.parseInt(br.readLine()) + 1000000] = true;
		}

		for(int i = 0; i < arr.length; i++) {
			if(arr[i]) {
				sb.append((i - 1000000)).append('\n');
			}
		}

		System.out.print(sb);
		*/

        /*P2751*/
        /*static int N;
        static int[] nums,ans;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		boolean[] arr = new boolean[2000001];

		for (int i = 0; i <N; i++) {
			arr[Integer.parseInt(br.readLine())+1000000] = true;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]) sb.append((i-1000000)).append('\n');
		}
		System.out.println(sb);*/




    }
}
