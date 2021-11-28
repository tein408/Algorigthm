package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class P23738 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String ans = "";
        for(int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if(temp == 'B')
                ans += "v";
            else if(temp == 'E')
                ans += "ye";
            else if(temp == 'H')
                ans += "n";
            else if(temp == 'P')
                ans += "r";
            else if(temp == 'C')
                ans += "s";
            else if(temp == 'Y')
                ans += "u";
            else if(temp == 'X')
                ans += "h";
            else {
                String s = temp + "";
                ans += s.toLowerCase(Locale.ROOT);
            }

        }
        System.out.println(ans);
    }
}
