package BOJ.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        String[] member = new String[num];
        for (int i = 0; i < num; i++) member[i] = bf.readLine();

        int[] grade = weight(member);
        for (int i = 0; i < num; i++) System.out.print(grade[i]+" ");

    }

    public static int[] weight(String[] member){
        int[] grade = new int[member.length];
        for(int i=0; i<member.length; i++){
            String[] tmp = member[i].split(" ");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);
            grade[i] = height(member, a, b);
        }
        return grade;
    }

    public static int height(String[] member, int x, int y){
        int cnt = 1;
        for(int i=0; i<member.length; i++){
            String[] tmp = member[i].split(" ");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);
            if( x < a && y < b) cnt++;
        }
        return cnt;
    }

}
