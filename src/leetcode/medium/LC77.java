package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class LC77 {

    int n, k;
    List<List<Integer>> ans = new ArrayList<>();

    void solv(int idx, List<Integer> list) {
        if(list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx; i<=n; i++) {
            if(list.size() + n - i + 1 < k)
                break;
            list.add(i);
            solv(i+1, list);
            list.remove(list.size()-1);
        }

    }

    //조금 비슷하지만 다른 풀이
/*    void solv(List<List<Integer>> ans, List<Integer> list, int[] n, int k, int idx) {
        if(list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx; i<=k; i++) {
            list.add(i);
            solv(ans, list, n, k, i+1);
            list.remove(list.size() - 1);
        }
    }*/

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;

        solv(1, new ArrayList<>());

        return ans;
    }

}
