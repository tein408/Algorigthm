package SWExpertAcademy.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1231 {

    static char[] tree;
    static int num;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i=1; i<=10; i++) {
            num = Integer.parseInt(bf.readLine());
            tree = new char[num+1];
            for(int j=0; j<num; j++) {
                st = new StringTokenizer(bf.readLine(), " ");
                tree[Integer.parseInt(st.nextToken())] = st.nextToken().charAt(0);
            }
            System.out.print("#" + i + " ");
            inOrder(1);
            System.out.println();
        }
    }

    static void inOrder(int idx){
        if(idx > num) {
            return;
        }
            inOrder(idx*2);
            System.out.print(tree[idx]);
            inOrder(idx*2+1);
    }



}
