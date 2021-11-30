package leetcode.easy;

public class LC104 {

    public int maxDepth(TreeNode104 root) {
        if(root == null)
            return 0;
        return depth(root, 0);
    }

    int depth(TreeNode104 root, int n) {
        if(root == null)
            return n;
        return Math.max(depth(root.left, n+1), depth(root.right, n+1));
    }

}


//Definition for a binary tree node.
class TreeNode104 {
    int val;
    TreeNode104 left;
    TreeNode104 right;

    TreeNode104() {
    }

    TreeNode104(int val) {
        this.val = val;
    }

    TreeNode104(int val, TreeNode104 left, TreeNode104 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
