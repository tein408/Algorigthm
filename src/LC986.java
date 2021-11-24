import java.util.ArrayList;
import java.util.List;

public class LC986 {

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if(firstList == null || secondList == null) {
            return null;
        }

        List<int[]> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        //범위 벗어나면 안됨
        while(i < firstList.length && j < secondList.length) {
            //시작 값은 큰걸로
            int start = Math.max(firstList[i][0], secondList[j][0]);
            //끝 값은 작은걸로
            int end = Math.min(firstList[i][1], secondList[j][1]);

            //만족할때만 추가
            if(start <= end)
                ans.add(new int[] {start, end});

            if(firstList[i][1] < secondList[j][1])
                i++;
            else
                j++;
        }

        return ans.toArray(new int[ans.size()][]);
    }

}

