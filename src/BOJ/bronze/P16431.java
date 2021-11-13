package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16431 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int[] b = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        st = new StringTokenizer(bf.readLine(), " ");
        int[] d = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        st = new StringTokenizer(bf.readLine(), " ");
        int[] j = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        int[] daisy = {Math.abs(d[0] - j[0]), Math.abs(d[1] - j[1])};
        int[] bessie = {Math.abs(b[0] - j[0]), Math.abs(b[1] - j[1])};

        int dMove = daisy[0] + daisy[1];
        int bMove = bessie[0] >= bessie[1] ? bessie[0] : bessie[1];

        if(bMove < dMove)
            System.out.println("bessie");
        else if(bMove > dMove)
            System.out.println("daisy");
        else
            System.out.println("tie");

    }
}
