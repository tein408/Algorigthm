package leetcode.medium;

public class LC117 {

    public Node117 connect(Node117 root) {
        if(root == null)
            return null;

        Node117 original = root;

        while(root != null) {
            Node117 temp = new Node117();
            Node117 curr = temp;
            while(root != null) {
                if(root.left != null) {
                    curr.next = root.left;
                    curr = curr.next;
                }
                if(root.right != null) {
                    curr.next = root.right;
                    curr = curr.next;
                }
                root = root.next;
            }
            root = temp.next;
        }

        return original;
    }

}


// Definition for a Node.
class Node117 {
    public int val;
    public Node117 left;
    public Node117 right;
    public Node117 next;

    public Node117() {}

    public Node117(int _val) {
        val = _val;
    }

    public Node117(int _val, Node117 _left, Node117 _right, Node117 _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}

