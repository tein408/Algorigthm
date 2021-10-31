package BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {
    char node;
    Node left, right;
    Node(char node){
        this.node = node;
    }
}

class Tree {
    Node root;

    public void addTree(char node, char left, char right) {
        if(root == null){
            root = new Node(node);
            if(left != '.') root.left = new Node(left);
            if(right != '.') root.right = new Node(right);
        }
        else {
            searchNode(root, node, left, right);
        }
    }

    public void searchNode(Node node, char data, char left, char right){
        if(node == null) return;
        else if(node.node == data) {
            if(left !=  '.') node.left = new Node(left);
            if(right !=  '.') node.right = new Node(right);
        } else {
            searchNode(node.left, data, left, right);
            searchNode(node.right, data, left, right);
        }
    }

    public void preOrder(Node root) {
        System.out.print(root.node);
        if(root.left != null) preOrder(root.left);
        if(root.right != null) preOrder(root.right);
    }

    public void inOrder(Node root) {
        if(root.left != null) inOrder(root.left);
        System.out.print(root.node);
        if(root.right != null) inOrder(root.right);
    }

    public void postOrder(Node root) {
        if(root.left != null) postOrder(root.left);
        if(root.right != null) postOrder(root.right);
        System.out.print(root.node);
    }

}

public class P1991 {

    public static void main(String[] args) throws Exception{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = Integer.parseInt(bf.readLine());

        Tree tree = new Tree();

        for(int i=0; i<num; i++) {
            String line = bf.readLine();
            st = new StringTokenizer(line, " ");
            char node = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            tree.addTree(node, left, right);
        }

        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);

    }

}