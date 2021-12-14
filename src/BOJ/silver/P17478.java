package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P17478 {

    static String q = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n";
    static String jae = "\"재귀함수가 뭔가요?\"\n";
    static String jal = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
    static String ma = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
    static String he = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";
    static String lago = "라고 답변하였지.\n";
    static String answer = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
    static String bar = "";

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        sb.append(q);
        repeat(n);
        System.out.println(sb);
    }

    static void repeat(int n) {
        String under = bar;
        if(n == 0) {
            sb.append(under).append(jae);
            sb.append(under).append(answer);
            sb.append(under).append(lago);
            return;
        }

        sb.append(under).append(jae);
        sb.append(under).append(jal);
        sb.append(under).append(ma);
        sb.append(under).append(he);

        bar += "____";
        n--;
        repeat(n);

        sb.append(under).append(lago);
    }

}
