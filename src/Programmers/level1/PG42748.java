package Programmers.level1;

import java.util.Arrays;

public class PG42748 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] comm = {{2,5,3},{4,4,1},{1,7,3}};
        int[] re = solution(array,comm);
        for(int i : re) System.out.println(i);
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int a=commands[i][0];
            int b=commands[i][1];
            //System.out.println("a : "+a+", b : "+b);
            int[] temp = new int[b];
            temp = Arrays.copyOfRange(array, a-1, b);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }

}
