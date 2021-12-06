package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5639 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int root = Integer.parseInt(bf.readLine());
        Node node = new Node(root);

        while(true) {
            String str = bf.readLine();
            if(str == null)
                break;
            node.insert(Integer.parseInt(str));
        }
        postOrder(node);
    }

    static void postOrder(Node node) {
        if(node.left != null)
            postOrder(node.left);
        if(node.right != null)
            postOrder(node.right);
        System.out.println(node.root);
    }

    static class Node {
        int root;
        Node left, right;

        public Node(int root) {
            this.root = root;
        }
        void insert(int node) {
            if(node < root) {
                if(left == null)
                    left = new Node(node);
                else
                    left.insert(node);
            } else {
                if(right == null)
                    right = new Node(node);
                else
                    right.insert(node);
            }
        }
    }

}
