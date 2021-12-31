package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P12738 {

    static int n;
    static int[] arr;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        list.add(Integer.MIN_VALUE);

        n = Integer.parseInt(bf.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > list.get(list.size()-1)) {
                list.add(arr[i]);
            }
            else {
                search(arr[i]);
            }
        }

        System.out.println(list.size()-1);

    }

    static void search(int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if(list.get(mid) >= target)
                right = mid;
            else
                left = mid + 1;
        }
        list.set(right, target);
    }

}
