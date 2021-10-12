package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P20546 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int mon = Integer.parseInt(bf.readLine());
        int junMon = mon;
        int minMon = mon;
        int junCnt = 0;
        int minCnt = 0;

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int[] arr = new int[14];

        for(int i=0; i<14; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<14; i++) {
            while(arr[i] <= junMon) {
                junCnt++;
                junMon -= arr[i];
            }
            if(i>2) {
                if(arr[i] > arr[i-1] && arr[i-1] > arr[i-2] && arr[i-2] > arr[i-3]) {
                    while(minCnt > 0) {
                        minCnt--;
                        minMon += arr[i];
                    }
                }
                else if(arr[i] < arr[i-1] && arr[i-1] < arr[i-2] && arr[i-2] < arr[i-3]) {
                    while(arr[i] <= minMon) {
                        minCnt++;
                        minMon -= arr[i];
                    }
                }
            }
        }

        int ansJun = junMon + arr[13] * junCnt;
        int ansMin = minMon + arr[13] * minCnt;

        if(ansJun > ansMin)
            System.out.println("BNP");
        else if(ansJun < ansMin)
            System.out.println("TIMING");
        else
            System.out.println("SAMESAME");


    }
}
