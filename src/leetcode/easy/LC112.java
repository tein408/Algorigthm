package leetcode.easy;

public class LC112 {

    public boolean hasPathSum(TreeNode112 root, int targetSum) {
        if(root == null)
            return false;

        if(root.left == null && root.right == null)
            return root.val == targetSum;

        boolean left = hasPathSum(root.left, targetSum - root.val);
        boolean right = hasPathSum(root.right, targetSum - root.val);
        return left || right;
    }

}

//Definition for a binary tree node.
class TreeNode112 {
    int val;
    TreeNode112 left;
    TreeNode112 right;

    TreeNode112() {
    }

    TreeNode112(int val) {
        this.val = val;
    }

    TreeNode112(int val, TreeNode112 left, TreeNode112 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}