package leetcode.medium;

public class LC98 {

    //stack을 이용한 풀이
/*    Stack<TreeNode98> stack = new Stack<>();

    public boolean isValidBST(TreeNode98 root) {
        if(root == null)
            return true;

        inOrder(root);

        while(!stack.isEmpty() && stack.size() > 1) {
            TreeNode98 curr = stack.pop();
            if(curr.val <= stack.peek().val)
                return false;
        }

        return true;
    }

    void inOrder(TreeNode98 node) {
        if(node != null) {
            inOrder(node.left);
            stack.push(node);
            inOrder(node.right);
        }
    }*/

    //재귀
    public boolean isValidBST(TreeNode98 root) {
        return solv(root, null, null);
    }

    boolean solv(TreeNode98 root, TreeNode98 left, TreeNode98 right) {
        if(root == null)
            return true;
        if(left != null && left.val >= root.val)
            return false;
        if(right != null && right.val <= root.val)
            return false;
        return solv(root.left, left, root) && solv(root.right, root, right);
    }

}


//Definition for a binary tree node.
class TreeNode98 {
    int val;
    TreeNode98 left;
    TreeNode98 right;

    TreeNode98() {
    }

    TreeNode98(int val) {
        this.val = val;
    }

    TreeNode98(int val, TreeNode98 left, TreeNode98 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
