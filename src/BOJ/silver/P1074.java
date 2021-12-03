package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1074 {

    static int n, r, c, size, cnt = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        size = (int) Math.pow(2, n);
        search(0, 0);
    }

    static void search(int x, int y) {
        while(size > 0) {
            size /= 2;
            //왼쪽위
            if(r < x+size && c < y+size) {
                cnt += 0;
            }
            //오른쪽위
            else if(r < x+size) {
                cnt += size * size;
                y += size;
            }
            //왼쪽아래
            else if(c < y+size) {
                cnt += (size * size) * 2;
                x += size;
            }
            //오른쪽아래
            else {
                cnt += (size * size) * 3;
                x += size;
                y += size;
            }
            if(size == 1) {
                System.out.println(cnt);
                break;
            }
        }
    }
}
