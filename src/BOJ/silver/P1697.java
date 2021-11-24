package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1697 {

    static int n, k;
    static int[] visit = new int[100001];

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        //n >= k 면 뒤로 가는 방법 밖에 없음
        if(n >= k) {
            System.out.println(n-k);
            return;
        }

        find();
        System.out.println(visit[n]);

    }

    static void find() {
        Queue<Integer> que = new LinkedList<>();
        que.add(n);

        while(!que.isEmpty()) {
            n = que.poll();

            if(n == k) {
                break;
            }

            //방문 하지 않은 경우
            //각 조건별로
            //다음 위치의 도착 시간 값을 현재 위치의 시간 값에 1초씩 더해서 저장
            //그리고 움직이는건 범위 내에서 움직여야함.
            if(n-1 >= 0 && visit[n-1] == 0) {
                que.add(n-1);
                visit[n-1] = visit[n] + 1;
            }
            if(n+1 < 100001 && visit[n+1] == 0) {
                que.add(n+1);
                visit[n+1] = visit[n] + 1;
            }
            if(n*2 < 100001 && visit[n*2] == 0) {
                que.add(n*2);
                visit[n*2] = visit[n] + 1;
            }
        }
    }
}
