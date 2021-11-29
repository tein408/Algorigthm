package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class LC118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int row=0; row<numRows; row++) {
            List<Integer> list = new ArrayList<>();
            for(int col=0; col<=row; col++) {
                if(col == 0 || col == row)
                    list.add(1);
                else {
                    int a = ans.get(row-1).get(col-1);
                    int b = ans.get(row-1).get(col);
                    list.add(a+b);
                }
            }
            ans.add(list);
        }
        return ans;
    }

}
