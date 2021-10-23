package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P9375 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        while(t-- > 0) {
            int n = Integer.parseInt(bf.readLine());
            Map<String, Integer> cloth = new HashMap<>();

            for(int i=0; i<n; i++) {
                String temp = bf.readLine().split(" ")[1];
                //의상 이름은 불필요하고, 개수만 필요하므로
                //의상 종류를 key로 하여 value에 개수 저장
                //이미 있는 key면 value에 +1
                if(cloth.containsKey(temp))
                    cloth.put(temp, cloth.get(temp) + 1);
                else
                    cloth.put(temp, 1);
            }

            int cnt = 1;
            //의상으로 뽑을 수 있는 종류 곱함
            //조합 공식 사용(nCr) : n! / (n-r)! * r!
            //각 의상 종류 한개씩 선택하여 뽑을 수 있는 경우 + 1(안입는 경우)
            //ex 모자2, 상의3 => 2C1 * 3C1 - 1(모두안입을경우) = 2 * 3 - 1 = 5
            for(int i : cloth.values()) {
                cnt *= (i + 1);
            }

            System.out.println(cnt-1);

        }

    }
}
