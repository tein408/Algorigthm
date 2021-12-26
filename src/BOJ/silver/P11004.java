package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11004 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int num = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());

        int[] arr = new int[num];
        st = new StringTokenizer(bf.readLine()," ");
        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(arr,0,num-1);

        if(cnt!=0)
            System.out.println(arr[cnt-1]);
        else if(cnt==0)
            System.out.println(arr[cnt]);

    }

    static void swap (int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end);

        if (start < part2 - 1) {
            quickSort(arr, start, part2 - 1);
        }
        if (part2 < end) {
            quickSort(arr, part2, end);
        }
    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];

        while (start <= end) {
            while (arr[start] < pivot)
                start++;
            while (arr[end] > pivot)
                end--;

            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }



}
