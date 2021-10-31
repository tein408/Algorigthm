package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P1966 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(bf.readLine());

        for(int i=0; i<t; i++) {
            String str = bf.readLine();
            int n = Integer.parseInt(str.split(" ")[0]);
            int m = Integer.parseInt(str.split(" ")[1]);
            Queue<Integer> queue = new LinkedList<>();
            int[] arr = new int[n];

            st = new StringTokenizer(bf.readLine(), " ");
            for(int j=0; j<n; j++) {
                int temp = Integer.parseInt(st.nextToken());
                queue.add(temp);
                arr[j] = temp;
            }

            Arrays.sort(arr);
            int cnt = 0;
            int idx = arr.length-1;

            while(queue.size() != 0) {
                int peek = queue.peek();
                if(arr[idx] == peek) {  //큐의 첫번째 값이 최대값이면
                    queue.poll();
                    cnt++;
                    if(m==0)    //현재 인쇄하려는 문서가 m번째인 경우
                        break;
                    else
                        m--; //m번째가 아닌 경우
                    idx--;
                } else {    //큐의 첫번째 문서보다 중요도가 높은 문서가 큐에 있는 경우
                    queue.add(queue.poll());
                    if(m==0)    //현재 문서가 m번째 문서이면 -> 맨 뒤로 이동 -> 인덱스 수정
                        m = queue.size()-1;
                    else        //m번째 문서가 아니라면 1 감소
                        m -= 1;
                }
            }
            System.out.println(cnt);
        }
    }
}
