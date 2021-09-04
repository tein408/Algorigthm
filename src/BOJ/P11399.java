package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11399 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int[] arr = new int[num];
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] hap = new int[num];
        Arrays.sort(arr);
        int re = arr[0];
        int sum = re;
        for(int i=1; i<num; i++){
            re = re + arr[i];
            sum += re;
        }
        /*for(int i=0; i<num; i++){
            for(int j=0; j<=i; j++){
                hap[i] = sum(arr, j);
            }
        }
        for(int i=0; i<num; i++)
            re += hap[i];*/

        System.out.println(sum);

    }

    /*static int sum(int[] n, int m){
        if(m<=0)
            return n[0];
        return n[m] + sum(n,m-1);
    }
*/

}
