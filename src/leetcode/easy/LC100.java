package leetcode.easy;

public class LC100 {

    public boolean isSameTree(TreeNode100 p, TreeNode100 q) {
        if(p == null && q == null)
            return true;
        if(p == null || q == null)
            return false;

        if(p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }

}


// Definition for a binary tree node.
class TreeNode100 {
    int val;
    TreeNode100 left;
    TreeNode100 right;

    TreeNode100() {
    }

    TreeNode100(int val) {
        this.val = val;
    }

    TreeNode100(int val, TreeNode100 left, TreeNode100 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

