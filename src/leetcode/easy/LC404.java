package leetcode.easy;

class LC404 {
    public int sumOfLeftLeaves(TreeNode404 root) {
        return sum(root);

    }
    int sum(TreeNode404 root) {
        if(root==null)
            return 0;
        int sum = 0;

        if(root.left!=null) {
            if(root.left.left == null && root.left.right == null)
                sum += root.left.val;
            else
                sum += sum(root.left);
        }
        sum += sum(root.right);
        return sum;
    }
}

//Definition for a binary tree node.
class TreeNode404 {
    int val;
    TreeNode404 left;
    TreeNode404 right;
    TreeNode404() {}
    TreeNode404(int val) { this.val = val; }
    TreeNode404(int val, TreeNode404 left, TreeNode404 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}