package BOJ.bronze;

import java.time.LocalDate;

public class P16170 {
    public static void main(String[] args) throws Exception {
        LocalDate date = LocalDate.now();
        String ans = date.toString();
        System.out.println(ans.split("-")[0]);
        System.out.println(ans.split("-")[1]);
        System.out.println(ans.split("-")[2]);
    }
}
