package BOJ.platinum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P16496 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        List<MergeNumber> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int zero = 0;
        for(int i=0; i<n; i++) {
            String str = st.nextToken();
            list.add(new MergeNumber(str));
            if(str.equals("0"))
                zero++;
        }

        if(zero == n || n == 1) {
            System.out.println(list.get(0).original);
            return;
        }

        Collections.sort(list);

        for(int i=n-1; i>=0; i--) {
            sb.append(list.get(i).original);
        }

        System.out.println(sb);

    }

}

class MergeNumber implements Comparable<MergeNumber> {

    StringBuilder sb = new StringBuilder();
    long original;

    public MergeNumber(String n) {
        this.original = Long.parseLong(n);

        for(int i=0; i<10; i++) {
            int temp = i % n.length();
            sb.append(n.charAt(temp));
        }
    }

    @Override
    public int compareTo(MergeNumber o) {
        Long curr = Long.parseLong(this.sb.toString());
        Long next = Long.parseLong(o.sb.toString());

        return Long.compare(curr, next);
    }
}
