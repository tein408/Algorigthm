package BOJ.platinum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class P14003 {

    static int n;
    static int[] arr, index;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        list.add(Integer.MIN_VALUE);

        n = Integer.parseInt(bf.readLine());
        arr = new int[n];
        index = new int[n];

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > list.get(list.size()-1)) {
                list.add(arr[i]);
                index[i] = list.size() - 1;
            }
            else {
                search(i);
            }
        }

        int max = list.size() - 1;
        sb.append(max).append("\n");

        Stack<Integer> stack = new Stack<>();
        for(int i=n-1; i>=0; i--) {
            if(index[i] == max) {
                stack.push(arr[i]);
                max--;
            }
        }

        while(!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }

        System.out.println(sb);

    }

    static void search(int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if(list.get(mid) >= arr[target])
                right = mid;
            else
                left = mid + 1;
        }
        list.set(right, arr[target]);
        index[target] = right;
    }

}
