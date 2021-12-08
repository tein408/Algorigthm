package leetcode.easy;

public class LC563 {
    int val = 0;
    public int findTilt(TreeNode563 root) {
        solv(root);
        return val;
    }

    int solv(TreeNode563 node) {
        if(node == null)
            return 0;
        int left = solv(node.left);
        int right = solv(node.right);
        val += Math.abs(left - right);
        return left + right + node.val;
    }

}


//Definition for a binary tree node.
class TreeNode563 {
    int val;
    TreeNode563 left;
    TreeNode563 right;

    TreeNode563() {
    }

    TreeNode563(int val) {
        this.val = val;
    }

    TreeNode563(int val, TreeNode563 left, TreeNode563 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
