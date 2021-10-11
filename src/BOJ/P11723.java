package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P11723 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Set<Integer> set = new HashSet<>();
        StringBuffer sb = new StringBuffer();

        while(n-- > 0) {
            String str = bf.readLine();
            char c = str.charAt(0);
            if(c == 'a') {
                if(str.charAt(1) == 'd') {
                    int temp = Integer.parseInt(str.split(" ")[1]);
                    set.add(temp);
                }
                else if(str.charAt(1) == 'l') {
                    set.clear();
                    for(int i=1; i<21; i++) {
                        set.add(i);
                    }
                }
            }
            else if(c == 'r') {
                int temp = Integer.parseInt(str.split(" ")[1]);
                set.remove(temp);
            }
            else if(c == 'c') {
                int temp = Integer.parseInt(str.split(" ")[1]);
                int re = set.contains(temp)? 1:0;
                sb.append(re).append("\n");
            }
            else if(c == 't') {
                int temp = Integer.parseInt(str.split(" ")[1]);
                if(set.contains(temp))
                    set.remove(temp);
                else
                    set.add(temp);
            }
            else if(c == 'e') {
                set.clear();
            }

        }
        System.out.println(sb);

    }
}
