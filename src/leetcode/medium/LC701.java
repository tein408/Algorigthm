package leetcode.medium;

public class LC701 {

    public TreeNode701 insertIntoBST(TreeNode701 root, int val) {
        TreeNode701 node = new TreeNode701(val);
        if(root == null)
            return node;

        TreeNode701 curr = root;
        while(true) {
            if(curr.val > val) {
                if(curr.left == null) {
                    curr.left = node;
                    break;
                }
                curr = curr.left;
            } else {
                if(curr.right == null) {
                    curr.right = node;
                    break;
                }
                curr = curr.right;
            }
        }
        return root;
    }
}

//Definition for a binary tree node.
class TreeNode701 {
    int val;
    TreeNode701 left;
    TreeNode701 right;

    TreeNode701() {
    }

    TreeNode701(int val) {
        this.val = val;
    }

    TreeNode701(int val, TreeNode701 left, TreeNode701 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}