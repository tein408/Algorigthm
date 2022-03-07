package tree;

class Node {
    private char data;
    private Node left;
    private Node right;

    public Node(char data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

public class Treenode {

    public static void main(String[] args) {

    }

    public static void preOrder(Node root) {
        if(root != null) {
            System.out.println(root.getData() + " ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    public static void inOrder(Node root) {
        if(root != null) {
            inOrder(root.getLeft());
            System.out.println(root.getData() + " ");
            inOrder(root.getRight());
        }
    }

    public static void postOrder(Node root) {
        if(root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.println(root.getData() + " ");
        }
    }

}
