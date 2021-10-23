package BOJ.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        int[] arr = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = i+1;
        }

        if(num>2) {
            int[] temp = new int[num];
            temp[0] = 2;
            temp[1] = 2;
            temp[2] = 4;
            int j = 1;
            for(int i=3; i<num; i++){
                if( temp[i-1] == arr[i] ){
                    j=1;
                    temp[i] = j*2;
                }
                else {
                    temp[i] = j*2;
                }
                j++;
            }
            System.out.println(temp[num-2]);
        }
        else if(num==1) System.out.println(1);
        else if(num==2) System.out.println(2);







    }

}


