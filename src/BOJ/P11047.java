package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11047 {
    public static void main(String[] args) throws Exception{
        // 동전은 총 N종류
        //그 가치의 합을 K , 동전 개수의 최솟값
        //첫째 줄에 N과 K가 주어진다.
        //둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다.
        // (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
        //첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int num = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int[] coin = new int[num];
        int changes = 0;

        for(int i = 0; i<num; i++){
            coin[i] = Integer.parseInt(bf.readLine());
        }

        for(int i = coin.length-1; i>=0; i--){
            while(money >= coin[i]){
                money -= coin[i];
                changes++;
            }
        }

        System.out.println(changes);


    }
}
