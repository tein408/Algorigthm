package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2693 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(bf.readLine());
        StringTokenizer st;

        while(t-- > 0) {
            st = new StringTokenizer(bf.readLine(), " ");
            int[] arr = new int[10];

            for(int i=0; i<10; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            //max heap 만들기
            for(int i=arr.length/2-1; i>=0; i--) {
                heapify(arr, arr.length, i);
            }

            //정렬
            for(int i=arr.length-1; i>=0; i--) {
                change(arr, i, 0);
                heapify(arr, i-1, 0);
            }

            sb.append(arr[arr.length - 3]).append("\n");

        }

        System.out.println(sb);


    }

    //max heap 만들기
    static void heapify(int[] arr, int size, int node) {
        int parent = node;
        int left = node * 2 + 1;   //left child node
        int right = node * 2 + 2;   //right child node

        if(size > left && arr[parent] < arr[left])
            parent = left;

        if(size > right && arr[parent] < arr[right])
            parent = right;

        if(parent != node) {
            change(arr, node, parent);
            heapify(arr, size, parent);
        }
    }

    static void change(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

}
