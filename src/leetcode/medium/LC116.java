package leetcode.medium;

public class LC116 {

    public Node116 connect(Node116 root) {
        if(root == null)
            return null;

        Node116 original = root;

        while(root != null) {
            Node116 curr = root;
            while(curr != null) {
                if(curr.left != null)
                    curr.left.next = curr.right;
                if(curr.right != null && curr.next != null)
                    curr.right.next = curr.next.left;
                curr = curr.next;
            }
            root = root.left;
        }

        return original;
    }

}


// Definition for a Node.
class Node116 {
    public int val;
    public Node116 left;
    public Node116 right;
    public Node116 next;

    public Node116() {}

    public Node116(int _val) {
        val = _val;
    }

    public Node116(int _val, Node116 _left, Node116 _right, Node116 _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
