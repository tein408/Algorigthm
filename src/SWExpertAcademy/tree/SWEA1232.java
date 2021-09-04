package SWExpertAcademy.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {
    public String node;
    public double num;
    public int left;
    public int right;

    public Node(String node, double num, int left, int right) {
        this.node = node;
        this.num = num;
        this.left = left;
        this.right = right;
    }
}

class Tree04 {

    static int N;
    static Node[] tree = new Node[1001];

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i=0; i<10; i++) {
            N = Integer.parseInt(bf.readLine());

            for(int j = 1; j <= N; j++) {
                st = new StringTokenizer(bf.readLine(), " ");
                st.nextToken();
                if(st.countTokens() > 1)
                    tree[j] = new Node(st.nextToken(), 0, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
                 else
                    tree[j] = new Node("", Double.parseDouble(st.nextToken()), -1, -1);
            }

            for(int j = N; j>0; j--) {
                if(tree[j].left > 0 && tree[j].right > 0){
                    if(tree[j].node.equals("+"))
                        tree[j].num = tree[tree[j].left].num + tree[tree[j].right].num;
                    else if(tree[j].node.equals("-"))
                        tree[j].num = tree[tree[j].left].num - tree[tree[j].right].num;
                    else if(tree[j].node.equals("*"))
                        tree[j].num = tree[tree[j].left].num * tree[tree[j].right].num;
                    else
                        tree[j].num = tree[tree[j].left].num / tree[tree[j].right].num;
                }
            }
            System.out.println("#" + (i+1) + " " + ((int) tree[1].num));
        }

    }

}
