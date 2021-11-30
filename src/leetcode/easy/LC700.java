package leetcode.easy;

public class LC700 {
    TreeNode700 node = null;
    public TreeNode700 searchBST(TreeNode700 root, int val) {
        solv(root, val);
        return node;
    }

    void solv(TreeNode700 root, int val) {
        if(root.val == val) {
            node = root;
            return;
        }
        if(root.left != null)
            searchBST(root.left, val);
        if(root.right != null)
            searchBST(root.right, val);
    }

}

//Definition for a binary tree node.
class TreeNode700 {
    int val;
    TreeNode700 left;
    TreeNode700 right;

    TreeNode700() {
    }

    TreeNode700(int val) {
        this.val = val;
    }

    TreeNode700(int val, TreeNode700 left, TreeNode700 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}