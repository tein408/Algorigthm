package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2477 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        String[] p = new String[num];
        String pa = "*";
        String ln = "\n";
        String space = " ";
        String[] test = {pa,pa,pa+ln,pa,space,pa+ln,pa,pa,pa};
       /* for(int i=0; i<num; i++){
            System.out.print(test[i]);
        }*/
        /*for(int i=0; i<num; i++){
            star(num);
        }*/

        //System.out.println();
        star(num);

        /*for(int i = 0; i<num; i++){
            if(i>0) System.out.println();
            for(int j = 0; j<num; j++){
                if(i==0 || i==(num-1)) System.out.print("*");
                else if(j==0 || j==(num-1)) System.out.print("*");
                else System.out.print(" ");
            }
        }*/



    }

    static void star(int num){
        for(int i = 0; i<num; i++){
            if(i>0) System.out.println();
            for(int j = 0; j<num; j++){
                if(i==0 || i==num-1) star2(3);
                else if(j==0 || j==num-1) star2(3);
                else System.out.print(" ");
            }
        }
    }

    static void star2(int num){
        for(int i = 0; i<num; i++){
            if(i>0) System.out.println();
            for(int j = 0; j<num; j++){
                if(i==0 || i==num-1) System.out.print("*");
                else if(j==0 || j==num-1) System.out.print("*");
                else System.out.print(" ");
            }
        }
    }

}
