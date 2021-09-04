package SWExpertAcademy.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1233 {

    static String[] tree;
    static int num;
    static int check = 1;

    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i=1; i<=10; i++) {
            num = Integer.parseInt(bf.readLine());
            tree = new String[num+1];
            for(int j=0; j<num; j++) {
                st = new StringTokenizer(bf.readLine(), " ");
                tree[Integer.parseInt(st.nextToken())] = st.nextToken();
            }
            test(num);
            System.out.println("#" + i + " "+check);
            check=1;
        }
    }

    static void test(int idx){
        while(idx != 1){
            if(isNumber(idx) && isNumber(idx-1) && !isNumber(idx/2)) {
                switch (tree[idx / 2]) {
                    /*
                    case "+":
                        tree[idx / 2] = Integer.parseInt(tree[idx - 1]) + Integer.parseInt(tree[idx]) + "";
                        break;
                    case "-":
                        tree[idx / 2] = Integer.parseInt(tree[idx - 1]) - Integer.parseInt(tree[idx]) + "";
                        break;
                    case "*":
                        tree[idx / 2] = Integer.parseInt(tree[idx - 1]) * Integer.parseInt(tree[idx]) + "";
                        break;
                    case "/":
                        if (tree[idx].equals("0")) tree[idx] = "1";
                        tree[idx / 2] = Integer.parseInt(tree[idx - 1]) / Integer.parseInt(tree[idx]) + "";
                        break;
                    */
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                    tree[idx/2] = 1+"";
                    break;
                }
                idx-=2;
            }
            else {
                check = 0;
                break;
            }
        }
    }

    static boolean isNumber(int idx) {
        if(!tree[idx].equals("+") && !tree[idx].equals("-") && !tree[idx].equals("*") && !tree[idx].equals("/")) {
            return true;
        }
        return false;
    }

}
