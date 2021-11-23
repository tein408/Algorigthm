package BOJ.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class P1655 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(bf.readLine());

        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());

        while(n-- > 0) {
            int num = Integer.parseInt(bf.readLine());

            //최대, 최소 크기 같으면 최대에 입력, 다르면 최소에 입력
            if(min.size() == max.size())
                max.add(num);
            else
                min.add(num);

            //둘 다 비어 있지 않고, min.peek < max.peek 면 바꾸기
            if(!min.isEmpty() && !max.isEmpty() && min.peek() < max.peek()) {
                int temp = min.poll();
                min.add(max.poll());
                max.add(temp);
            }
            //최대에서 peek
            sb.append(max.peek()).append("\n");
        }

        System.out.println(sb);
        
    }
}
