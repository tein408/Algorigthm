package leetcode;

public class L130 {

    static int m, n;
    static char[][] arr;

    static void solve(char[][] board) {
        m = board.length;
        n = board[0].length;
        arr = board;

        if(m == 0)
            return;

        //첫 행, 마지막 행에서 'O'일 때
        for(int i=0; i<n; i++) {
            if(arr[0][i] == 'O')
                dfs(0, i);
            if(arr[m-1][i] == 'O')
                dfs(m-1, i);
        }

        //맨 왼쪽, 맨 오른쪽에서 'O'일 때
        for(int i=0; i<m; i++) {
            if(arr[i][0] == 'O')
                dfs(i, 0);
            if(arr[i][n-1] == 'O')
                dfs(i, n-1);
        }

        //그 외 가운데 있는 'O' 찾아서 'X'로 교체
        //border에 있는 'O'는 다른 문자로 치환해두었으므로
        //border라고 표시해둔건 다시 'O'로 돌리기
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(arr[i][j] == 'O')
                    arr[i][j] = 'X';
                else if(arr[i][j] == '!')
                    arr[i][j] = 'O';
            }
        }

    }

    //border에서만 부르는 dfs()
    //border에 수직으로 연결된 노드 찾기 위함
    static void dfs(int x, int y) {
        //범위 밖이면 return
        //'O'가 아니어도 return
        if(x < 0 || x >= m || y < 0 || y >= n || arr[x][y] != 'O')
            return;

        //border에 있는 경우 임시로 다른 문자로 대체
        arr[x][y] = '!';

        dfs(x+1, y);
        dfs(x-1, y);
        dfs(x, y+1);
        dfs(x, y-1);

    }

    public static void main(String[] args) {
        char[][] board = { {'X','X','X','X'}, {'X','O','O','X'}, {'X','X','O','X'}, {'X','O','X','X'}};

        solve(board);

        for(int i=0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

}
