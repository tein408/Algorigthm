package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2751 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(bf.readLine());

        int[] list = new int[num];

        for(int i=0; i<num; i++){
            list[i] = Integer.parseInt(bf.readLine());
        }

        Merge m = new Merge(num);
        m.merge_sort(list, 0, num-1);

        for(int i=0; i<num; i++)
            sb.append(list[i]).append('\n');
        System.out.println(sb);

    }
}

class Merge{

    int[] sort;

    public Merge(int num){
        sort = new int[num];
    }


    void merge(int[] list, int left, int mid, int right){
        int i,j,k,l;
        i = left;
        j = mid + 1;
        k = left;

        while(i<=mid && j<=right){
            if(list[i]<=list[j]) sort[k++] = list[i++];
            else sort[k++] = list[j++];
        }

        if(i>mid)
            for(l=j; l<=right; l++)
                sort[k++] = list[l];

        else
            for(l=i; l<=mid; l++)
                sort[k++] = list[l];

        for(l=left; l<=right; l++)
            list[l] = sort[l];
    }

    void merge_sort(int[] list, int left, int right){
        int mid;
        if(left<right){
            mid = (left+right)/2;
            merge_sort(list, left, mid);
            merge_sort(list, mid+1, right);
            merge(list, left, mid, right);
        }
    }
}