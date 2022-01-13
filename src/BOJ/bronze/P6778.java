package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6778 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int antenna = Integer.parseInt(bf.readLine());
        int eye = Integer.parseInt(bf.readLine());

        if(antenna >= 3 && eye <= 4) {
            System.out.println("TroyMartian");
        }
        if(antenna <= 6 && eye >= 2) {
            System.out.println("VladSaturnian");
        }
        if(antenna <= 2 && eye <= 3) {
            System.out.println("GraemeMercurian");
        }
    }
}
