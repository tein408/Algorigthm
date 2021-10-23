package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2798 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(find(arr, n, m));


    }

    static int find(int[] arr, int n, int m) {
        int result = 0;
        for(int i=0; i<n-2; i++) {
            if(arr[i] > m)
                continue;

            for(int j=i+1; j<n-1; j++) {
                if(arr[j] > m)
                    continue;

                for(int k=j+1; k<n; k++) {
                    if(arr[k] > m)
                        continue;

                    int temp = arr[i] + arr[j] + arr[k];

                    if(m==temp)
                        return temp;
                    if(result < temp && temp < m)
                        result = temp;
                }
            }
        }
        return result;
    }
}
