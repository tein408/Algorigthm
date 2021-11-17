public class LC116 {

    public Node connect(Node root) {
        if(root == null)
            return null;

        Node original = root;

        while(root != null) {
            Node curr = root;
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
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
