package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11728 {

    //최대 길이로 배열 설정
    static int MAX_SIZE = 2000001;
    static int[] sort = new int[MAX_SIZE];

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int len = n + m;
        int[] arr = new int[len];
        StringBuffer sb = new StringBuffer();

        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=n; i<len; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(arr, 0, len-1);

        for(int i=0; i<len; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);

    }

    //분할된 배열 합병
    static void merge(int[] arr, int left, int mid, int right) {
        int i, j, k, l;
        i = left;
        j = mid + 1;
        k = left;

        //분할 정렬된 배열의 합병
        while(i <= mid && j <= right) {
            if(arr[i] <= arr[j])
                sort[k++] = arr[i++];
            else
                sort[k++] = arr[j++];
        }

        //남아 있는 값 일괄 복사
        while(i <= mid)
            sort[k++] = arr[i++];
        while(j <= right)
            sort[k++] = arr[j++];

        //sort[]의 원소를 배열 arr[]로 재복사
        for(l=left; l<=right; l++)
            arr[l] = sort[l];

    }

    //합병 정렬
    static void mergeSort(int[] arr, int left, int right) {
        int mid;
        if(left < right) {
            //중간 위치 계산 후 배열을 반으로 분할
            mid = (left+right)/2;
            //앞쪽 정렬
            mergeSort(arr, left, mid);
            //뒤쪽 정렬
            mergeSort(arr, mid+1, right);
            //정렬된 두 개를 합병
            merge(arr, left, mid, right);
        }
    }



}
