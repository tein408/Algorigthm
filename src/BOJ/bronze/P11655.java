package BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11655 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = bf.readLine();

        for(int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);

            if(Character.isLetter(curr)) {
                int next;
                if(Character.isLowerCase(curr)) {
                    next = curr - 'a' + 13;
                    if(next >= 26)
                        next -= 26;
                    next = next + 'a';
                } else {
                    next = curr - 'A' + 13;
                    if(next >= 26)
                        next -= 26;
                    next = next + 'A';
                }
                char n = (char) next;
                sb.append(n);
            } else {
                sb.append(curr);
            }
        }

        System.out.println(sb);
    }
}
