package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10989 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(bf.readLine());
        int[] arr = new int[num];
        int[] count = new int[10000001];

        for(int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }

        for(int i=0; i<num; i++){
            count[arr[i]]++;
        }

        for(int i=1; i<num; i++){
            if(count[i] != 0){
                for(int j=0; j<count[i];j++)
                    sb.append(i+"\n");
            }
        }

        System.out.println(sb);



    }
}
