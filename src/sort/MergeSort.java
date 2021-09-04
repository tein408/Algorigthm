package sort;

public class MergeSort {

    static int MAX_SIZE = 8;
    static int[] sort = new int[MAX_SIZE];

    static void merge(int[] list, int left, int mid, int right){
        int i,j,k,l;
        i = left;
        j = mid + 1;
        k = left;

        //분할 정렬된 list의 합병
        while(i<=mid && j<=right){
            if(list[i]<=list[j]) sort[k++] = list[i++];
            else sort[k++] = list[j++];
        }

        //남아 있는 값들을 일괄 복사
        if(i>mid) {
            for (l = j; l <= right; l++) {
                sort[k++] = list[l];
            }
        }

        //남아 있는 값들을 일괄 복사
        else {
            for (l = i; l <= mid; l++) {
                sort[k++] = list[l];
            }
        }

        //배열 sort[] (임시배열)의 리스트를 배열 list[]로 재복사
        for(l=left; l<=right; l++) {
            list[l] = sort[l];
        }
    }

    //합병정렬
    static void merge_sort(int[] list, int left, int right){
        int mid;
        if(left<right){
            mid = (left+right)/2; //중간 위치 계산하여 리스트를 균등 분할 - 분할 divide
            merge_sort(list, left, mid); //앞쪽 리스트 정렬 - 정복 conquer
            merge_sort(list, mid+1, right); //뒤쪽 리스트 정렬 - 정복 conquer
            merge(list, left, mid, right); //정렬된 2개의 부분 배열을 합병하는 과정 - 결합 combine
        }
    }

    public static void main(String[] args) {
        int i;
        int n = MAX_SIZE;
        int[] list = {21, 10, 12, 20, 25, 13, 15, 22};

        merge_sort(list, 0, n-1);

        for(i=0; i<n; i++)
            System.out.println(list[i]);

    }
}
