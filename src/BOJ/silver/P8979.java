package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P8979 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Rank[] ranks = new Rank[n+1];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int key = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());
            ranks[key] = new Rank(key, gold, silver, bronze);
        }

        int cnt = 1;
        Rank key = ranks[m];
        for(int i=1; i<=n; i++) {
            Rank curr = ranks[i];
            if(curr.gold > key.gold
                    || (curr.gold == key.gold && curr.silver > key.silver)
                || (curr.gold == key.gold && curr.silver == key.silver && curr.bronze > key.bronze) ) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

class Rank {
    int key;
    int gold;
    int silver;
    int bronze;

    public Rank(int key, int gold, int silver, int bronze) {
        this.key = key;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }
}
